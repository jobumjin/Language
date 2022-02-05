/* oracle ���� db ���� �ڵ带 mysql db ���� �ڵ�� ��ȯ
 * 
 * 1. driver�� build path�� �߰��� ����� �Բ�
 * 2. �ε� ~ �ڿ���ȯ �ڵ� �Ϻ� ����
 * 
 * 3. ��Ʈ
 * 	database�̸��� playdata
 * 
 * 4. insert.update.delete �߰� ���� ��� �н�
 */
package step01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest2 {
	
	public static void main(String [] args) {
		insert();
	}
	
	//Ư�� �����͸� �޼ҵ� ���ο� �����ؼ� ����
	public static void insert() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "url";
			
			Connection con = DriverManager.getConnection(url, id, pw);
			Statement stmt = con.createStatement();
			
			//sql ���� ���� update delete �ڵ� �Ȱ����� �Ʒ��κи� �ٸ�
			int rset = stmt.executeUpdate("insert into dept values(60, 'a', 'b')"); 
			
			System.out.println(rset + "�� ���� ����");
			
			//�ڿ� ��ȯ - ResultSet -> Statement -> Connection ������ �ڿ� ��ȯ
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void select() {
		try {
			//driver �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//����
			String url = "url";
			
			//oracle ���� ��ü
			Connection con = DriverManager.getConnection(url, id, pw);
			
			//oracle ���� �����ϴ� ���� ���� ��ü
			Statement stmt = con.createStatement();
			
			ResultSet rset = stmt.executeQuery("select * from dept");
			
			while(rset.next()) {
				System.out.println(rset.getString("deptno") + "\t" + rset.getString("dname") + "\t" +rset.getString("loc"));
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
