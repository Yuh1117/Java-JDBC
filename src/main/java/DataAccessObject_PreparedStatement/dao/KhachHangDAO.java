package DataAccessObject_PreparedStatement.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DataAccessObject_PreparedStatement.database.JDBCUtil;
import DataAccessObject_PreparedStatement.model.KhachHang;
import DataAccessObject_PreparedStatement.model.Sach;

public class KhachHangDAO implements DAOInterface<KhachHang> {

	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}

	@Override
	public int insert(KhachHang t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format(
					"INSERT INTO KhachHang (ID, HoVaTen, NgaySinh, DiaChi) " + "VALUES (%d, \"%s\", \"%s\", \"%s\")",
					t.getId(), t.getHoVaTen(), t.getNgaySinh(), t.getDiaChi());

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
	public int update(KhachHang t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format("UPDATE KhachHang " + "SET " + "HoVaTen = \"%s\"" + ", NgaySinh = \"%s\""
					+ ", DiaChi = \"%s\" " + "WHERE ID = %s", t.getHoVaTen(), t.getNgaySinh(), t.getDiaChi(),
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
	public int delete(KhachHang t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format("DELETE FROM KhachHang " + "WHERE ID = %d", t.getId());

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
	public ArrayList<KhachHang> selectAll() {
		ArrayList<KhachHang> result = new ArrayList<KhachHang>();
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = "SELECT * FROM KhachHang";

			//*
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Ban da thuc thi " + sql);
			if (rs != null) {
				while (rs.next()) {
					int id = rs.getInt("ID");
					String HoVaTen = rs.getString("HoVaTen");
					Date NgaySinh = rs.getDate("NgaySinh");
					String DiaChi = rs.getString("DiaChi");

					KhachHang k = new KhachHang(id, HoVaTen, NgaySinh, DiaChi);
					result.add(k);
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
	public KhachHang selectById(KhachHang t) {
		KhachHang result = null;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format( "SELECT * FROM KhachHang WHERE ID = %d", t.getId());
			
			//*
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Ban da thuc thi " + sql);
			if (rs != null) {
				while (rs.next()) {
					int id = rs.getInt("ID");
					String HoVaTen = rs.getString("HoVaTen");
					Date NgaySinh = rs.getDate("NgaySinh");
					String DiaChi = rs.getString("DiaChi");

					result = new KhachHang(id, HoVaTen, NgaySinh, DiaChi);
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
	public ArrayList<KhachHang> selectByCondition(String condition) {
		ArrayList<KhachHang> result = new ArrayList<KhachHang>();
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = "SELECT * FROM KhachHang WHERE " + condition;

			//*
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Ban da thuc thi " + sql);
			if (rs != null) {
				while (rs.next()) {
					int id = rs.getInt("ID");
					String HoVaTen = rs.getString("HoVaTen");
					Date NgaySinh = rs.getDate("NgaySinh");
					String DiaChi = rs.getString("DiaChi");

					KhachHang k = new KhachHang(id, HoVaTen, NgaySinh, DiaChi);
					result.add(k);
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
