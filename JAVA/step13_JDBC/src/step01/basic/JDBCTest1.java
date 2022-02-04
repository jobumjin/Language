/* dept table 검색
 * 발생 가능한 경우의 수(부정론자 관점)
 * 1. driver 로딩시 없을수도 있음
 * 	- ClassNotFoundException
 * 2. ip/id/pw가 오류
 * 	- 접속오류 (SQLException)
 * 3. sql 문법 오류...
 * 4. sql 문법은 맞으나 무결성 문제 등 발생..
 * 	- sql 오류 (SQLException)
 */
package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			//driver 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//접속
			String url = "자신의 url";
			
			//oracle 접속 객체
			Connection con = DriverManager.getConnection(url ,"id", "pw");
			
			//oracle 과만 소통하는 문장 실행 객체
			Statement stmt = con.createStatement();
			
			ResultSet rset = stmt.executeQuery("select * from dept");
			
			while(rset.next()) {
				System.out.println("deptno" + "\t" + rset.getString("dname") + "\t" +rset.getString("loc"));
			}
			
			//자원 반환 - ResultSet -> Statement -> Connection 순으로 자원 반환
			rset.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
