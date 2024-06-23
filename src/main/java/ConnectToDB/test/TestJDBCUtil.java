package ConnectToDB.test;

import java.sql.Connection;

import ConnectToDB.database.JDBCUtil;

public class TestJDBCUtil {
	public static void main(String[] args) {
		Connection connection = JDBCUtil.getConnection();
		System.out.println(connection);
		JDBCUtil.printInfo(connection);
		JDBCUtil.closeConnection(connection);
		
	}
}
