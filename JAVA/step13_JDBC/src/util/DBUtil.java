//��� DAO�� ���������� ���Ǵ� �ڵ��θ� ������ ������ ����
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	/* static {} - �� �ѹ� ���� 100% ����
	 * 	- �̸��� ���� ������ ȣ�� �Ұ�
	 * 	- �������� �����ϴ� �ڿ��� �ѹ��� �ʱ�ȭ �ϰ��� �� �� ���
	 * 
	 */
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//���� �����ؼ��� �ȵǴ� ��ü/ ��û�ø��� ���� �����ؼ� ����
	// ���� ������ Connection ��ü ��ȯ/���� ���н� ���� �߻�
	/* ���� ó���� ������ ����� �ݵ�� ȣ���� �������� ��Ȳ�ľ� �ʼ�
	 * try~catch�� ���� ó������ throws�� ��Ȳ�� ���� �˸����ε� ���
	 * 
	 * �޼ҵ� body {}
	 * 	1. throw new Exception ������ �ʼ�
	 * 	2. ���� ó�� ���� �߻��� ���ܸ� ȣ���� ������ �������� �� ��� 
	 * 	   catch ��� ���ο��� throw ���� ����; �߻�?
	 */
	public static Connection getConnection() throws SQLException {
		String url = "url";
		
		return DriverManager.getConnection(url, id, pw); 
	}
	
	// ��� DAO Ŭ�������� ��� �޼ҵ尡 �ݵ�� �����ϴ� �ڿ���ȯ ������ �޼ҵ�
	// select - ResultSet -> Statement -> Connection ��
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
	// insert/update/delete -> Statement -> Connection ��
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
