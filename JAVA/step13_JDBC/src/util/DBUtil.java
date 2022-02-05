//모든 DAO가 공통적으로 사용되는 코드들로만 구성된 최적의 구조
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	/* static {} - 단 한번 실행 100% 보장
	 * 	- 이름이 없기 때문에 호출 불가
	 * 	- 누구나가 공유하는 자원을 한번만 초기화 하고자 할 때 사용
	 * 
	 */
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//절대 공유해서는 안되는 객체/ 요청시마다 새로 생성해서 제공
	// 접속 성공시 Connection 객체 반환/접속 실패시 예외 발생
	/* 예외 처리는 문제가 생기면 반드시 호출한 곳에서도 상황파악 필수
	 * try~catch로 예외 처리보다 throws로 상황에 대한 알림으로도 사용
	 * 
	 * 메소드 body {}
	 * 	1. throw new Exception 생성시 필수
	 * 	2. 예외 처리 없이 발생된 예외를 호출한 곳으로 던지고자 할 경우 
	 * 	   catch 블록 내부에서 throw 예외 변수; 발생?
	 */
	public static Connection getConnection() throws SQLException {
		String url = "url";
		
		return DriverManager.getConnection(url, id, pw); 
	}
	
	// 모든 DAO 클래스들의 모든 메소드가 반드시 실행하는 자원반환 로직의 메소드
	// select - ResultSet -> Statement -> Connection 순
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if(rset != null) {
				rset.close();
				rset = null;
			}
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// insert/update/delete -> Statement -> Connection 순
	public static void close(Connection con, Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
