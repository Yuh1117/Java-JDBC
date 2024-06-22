package dao;

import java.sql.Connection;
import java.sql.ResultSet;
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

			result = st.executeUpdate(sql);
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
	public int update(Sach t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format("UPDATE Sach " + "SET " + "TenSach = \"%s\"" + ", GiaBan = %f"
					+ ", NamXuatBan = %d " + "WHERE ID = \"%s\"", t.getTenSach(), t.getGiaBan(), t.getNamXuatBan(),
					t.getId());

			result = st.executeUpdate(sql);
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
	public int delete(Sach t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format("DELETE FROM Sach " + "WHERE ID = \"%s\"", t.getId());

			result = st.executeUpdate(sql);
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
	public ArrayList<Sach> selectAll() {
		ArrayList<Sach> result = new ArrayList<Sach>();
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = "SELECT * FROM Sach";

			// *
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Ban da thuc thi " + sql);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("ID");
					String TenSach = rs.getString("TenSach");
					Float GiaBan = rs.getFloat("GiaBan");
					int NamXuatBan = rs.getInt("NamXuatBan");

					Sach s = new Sach(id, TenSach, GiaBan, NamXuatBan);
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
	public Sach selectById(Sach t) {
		Sach result = null;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format("SELECT * FROM Sach WHERE ID = \"%s\"", t.getId());

			// *
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Ban da thuc thi " + sql);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("ID");
					String TenSach = rs.getString("TenSach");
					Float GiaBan = rs.getFloat("GiaBan");
					int NamXuatBan = rs.getInt("NamXuatBan");

					result = new Sach(id, TenSach, GiaBan, NamXuatBan);
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
	public ArrayList<Sach> selectByCondition(String condition) {
		ArrayList<Sach> result = new ArrayList<Sach>();
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = "SELECT * FROM Sach WHERE " + condition;

			// *
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Ban da thuc thi " + sql);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("ID");
					String TenSach = rs.getString("TenSach");
					Float GiaBan = rs.getFloat("GiaBan");
					int NamXuatBan = rs.getInt("NamXuatBan");

					Sach s = new Sach(id, TenSach, GiaBan, NamXuatBan);
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

}
