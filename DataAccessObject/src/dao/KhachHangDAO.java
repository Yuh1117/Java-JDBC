package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

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
	public int update(KhachHang t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format(
					"UPDATE KhachHang " + "SET " + "HoVaTen = \"%s\"" + ", NgaySinh = \"%s\"" + ", DiaChi = \"%s\" " + "WHERE ID = %s",
					t.getHoVaTen(), t.getNgaySinh(), t.getDiaChi(), t.getId());
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
	public int delete(KhachHang t) {
		int result = 0;
		try {
			Connection c = JDBCUtil.getConnection();

			Statement st = c.createStatement();

			String sql = String.format(
					"DELETE FROM KhachHang " + "WHERE ID = %d", t.getId());
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
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
