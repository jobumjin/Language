/* 학습 내용
 * 
 * 1. 중복 코드 분리
 * 2. 최적의 구조로 변환
 * 3. 최적의 코드로 개선 - 리펙토링
 * 4. DAO 클래스로 개발
 * 
 * DBUtil.java - 모든 DAO들이 공유하는 로직으로만 구성
 * JDBCTest3 -< DeptDAO로 변경
 * 
 */
package step02.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.DBUtil;

public class DeptDAO {
	
	public static void main(String [] args) {
//		insert();
		select(); 
	}
	
	/* 현업 개발자
	 * parameter 즉 insert 하는 데이터는 브라우저에서 입력받는 가변적인 데이터
	 * 
	 */
	public static void insert() {
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DBUtil.getConnection();		
			stmt = con.createStatement();
			
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')"); 
			System.out.println(rset + "행 저장 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, stmt);
		}
		
	}
	
	public static void select() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {		
			con = DBUtil.getConnection();		
			stmt = con.createStatement();
			rset = stmt.executeQuery("select * from dept");
			
			while(rset.next()) {
				System.out.println(rset.getString("deptno") + "\t" + rset.getString("dname") + "\t" +rset.getString("loc"));
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, stmt,rset);
		}
		
	}

}
