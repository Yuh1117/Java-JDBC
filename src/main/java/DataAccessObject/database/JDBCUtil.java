package DataAccessObject.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;
		try {
			//Dang ky MySQL Driver voi DriverManager
			DriverManager.registerDriver(new Driver());
			
			//Cac thong so
			String url = "jdbc:mySQL://localhost:3306/NhaSach";
			String username = "root";
			String password = "";
			
			//Tao ket noi
			c = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection c) {
		if(c != null) {
			try {
				DatabaseMetaData d = c.getMetaData();
				System.out.println(d.getDatabaseProductName());
				System.out.println(d.getDatabaseProductVersion());
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
