package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {

	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format(
					"INSERT INTO Sach (ID, TenSach, GiaBan, NamXuatBan) " + "VALUES (\"%s\", \"%s\", \"%f\", %d)",
					t.getId(), t.getTenSach(), t.getGiaBan(), t.getNamXuatBan());
			System.out.println("Ban da thuc thi " + sql);

			result = st.executeUpdate(sql);
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
	public int update(Sach t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format(
					"UPDATE Sach " + "SET " + "TenSach = \"%s\"" + ", GiaBan = %f" + ", NamXuatBan = %d " + "WHERE ID = \"%s\"",
					t.getTenSach(), t.getGiaBan(), t.getNamXuatBan(), t.getId());
			System.out.println("Ban da thuc thi " + sql);

			result = st.executeUpdate(sql);
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
	public int delete(Sach t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format(
					"DELETE FROM Sach " + "WHERE ID = \"%s\"", t.getId());
			System.out.println("Ban da thuc thi " + sql);

			result = st.executeUpdate(sql);
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
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
