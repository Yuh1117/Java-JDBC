package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAOInterface<User> {

	public static UserDAO getInstance() {
		return new UserDAO();
	}

	@Override
	public int insert(User t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			String sql = "INSERT INTO User (UserName, PassWord, HoVaTen) " + "VALUES (?, ?, ?)";
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			pst.setString(2, t.getPassWord());
			pst.setString(3, t.getHoVaTen());

			result = pst.executeUpdate();
			System.out.println("Ban da thuc thi " + sql);

			if (result > 0) {
				System.out.println("So dong thay doi: " + result);
			} else {
				System.out.println("That bai");
			}

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int update(User t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			String sql = "UPDATE User " + "SET " + "PassWord = ?" + ", HoVaTen = ?" + "WHERE UserName = ?";
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setString(1, t.getPassWord());
			pst.setString(2, t.getHoVaTen());
			pst.setString(3, t.getUserName());

			result = pst.executeUpdate();
			System.out.println("Ban da thuc thi " + sql);
			
			if (result > 0) {
				System.out.println("So dong thay doi: " + result);
			} else {
				System.out.println("That bai");
			}

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int delete(User t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			String sql = "DELETE FROM User " + "WHERE UserName = ?";
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setString(1, t.getUserName());

			result = pst.executeUpdate();
			System.out.println("Ban da thuc thi " + sql);
			
			if (result > 0) {
				System.out.println("So dong thay doi: " + result);
			} else {
				System.out.println("That bai");
			}

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public ArrayList<User> selectAll() {
		ArrayList<User> result = new ArrayList<User>();
		try {
			Connection c = JDBCUtil.getConnection();

			String sql = "SELECT * FROM User";
			PreparedStatement pst = c.prepareStatement(sql);

			// *
			ResultSet rs = pst.executeQuery();
			System.out.println("Ban da thuc thi " + sql);
			
			if (rs != null) {
				while (rs.next()) {
					String UserName = rs.getString("UserName");
					String PassWord = rs.getString("PassWord");
					String HoVaTen = rs.getString("HoVaTen");

					User s = new User(UserName, PassWord, HoVaTen);
					result.add(s);
				}
			} else {
				System.out.println("That bai");
			}

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public User selectById(User t) {
		User result = null;
		try {
			Connection c = JDBCUtil.getConnection();

			String sql = "SELECT * FROM User WHERE UserName = ?";
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setString(1, t.getUserName());
			
			// *
			ResultSet rs = pst.executeQuery();
			System.out.println("Ban da thuc thi " + sql);
			
			if (rs != null) {
				while (rs.next()) {
					String UserName = rs.getString("UserName");
					String PassWord = rs.getString("PassWord");
					String HoVaTen = rs.getString("HoVaTen");

					result = new User(UserName, PassWord, HoVaTen);
				}
			} else {
				System.out.println("That bai");
			}

			JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public ArrayList<User> selectByCondition(String condition) {
		ArrayList<User> result = new ArrayList<User>();

		return result;
	}

}
