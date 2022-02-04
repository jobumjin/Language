/* dept table �˻�
 * �߻� ������ ����� ��(�������� ����)
 * 1. driver �ε��� �������� ����
 * 	- ClassNotFoundException
 * 2. ip/id/pw�� ����
 * 	- ���ӿ��� (SQLException)
 * 3. sql ���� ����...
 * 4. sql ������ ������ ���Ἲ ���� �� �߻�..
 * 	- sql ���� (SQLException)
 */
package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			//driver �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//����
			String url = "�ڽ��� url";
			
			//oracle ���� ��ü
			Connection con = DriverManager.getConnection(url ,"id", "pw");
			
			//oracle ���� �����ϴ� ���� ���� ��ü
			Statement stmt = con.createStatement();
			
			ResultSet rset = stmt.executeQuery("select * from dept");
			
			while(rset.next()) {
				System.out.println("deptno" + "\t" + rset.getString("dname") + "\t" +rset.getString("loc"));
			}
			
			//�ڿ� ��ȯ - ResultSet -> Statement -> Connection ������ �ڿ� ��ȯ
			rset.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
