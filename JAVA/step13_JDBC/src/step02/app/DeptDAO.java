/* �н� ����
 * 
 * 1. �ߺ� �ڵ� �и�
 * 2. ������ ������ ��ȯ
 * 3. ������ �ڵ�� ���� - �����丵
 * 4. DAO Ŭ������ ����
 * 
 * DBUtil.java - ��� DAO���� �����ϴ� �������θ� ����
 * JDBCTest3 -< DeptDAO�� ����
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
	
	/* ���� ������
	 * parameter �� insert �ϴ� �����ʹ� ���������� �Է¹޴� �������� ������
	 * 
	 */
	public static void insert() {
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DBUtil.getConnection();		
			stmt = con.createStatement();
			
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')"); 
			System.out.println(rset + "�� ���� ����");
			
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
