package DataAccessObject.test;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import DataAccessObject.database.JDBCUtil;

public class TestJDBCUtil {
	public static void main(String[] args) {
		try {
			// 1.Tao ket noi
			Connection connection = JDBCUtil.getConnection();

			// 2. Tao doi tuong statement
			java.sql.Statement st = connection.createStatement();

			// 3.Thuc thi sql
			String sql = "INSERT INTO persons (last_name, first_name, gender, dob, income)"
					+ "VALUES (\"Tran\", \"Thi\", \"C\", \"2000-09-10\", 10000000)";

			int check = st.executeUpdate(sql);

			// 4.Xu ly ket qua
			if (check > 0) {
				System.out.println("So dong thay doi: " + check);
			} else {
				System.out.println("That bai");
			}

			// 5.Ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
