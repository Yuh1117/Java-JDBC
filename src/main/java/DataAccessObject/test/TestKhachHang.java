package DataAccessObject.test;

import java.sql.Date;
import java.util.ArrayList;

import DataAccessObject.dao.KhachHangDAO;
import DataAccessObject.dao.SachDAO;
import DataAccessObject.model.KhachHang;
import DataAccessObject.model.Sach;

public class TestKhachHang {
	public static void main(String[] args) {
//		Date ns1 = Date.valueOf("1999-12-1");
//		KhachHang kh1 = new KhachHang(1, "Huy", ns1, "TPHoChiMinh");
//		Date ns2 = Date.valueOf("2002-2-2");
//		KhachHang kh2 = new KhachHang(2, "Gia", ns2, "TPHaNoi");
//		Test insert
//		KhachHangDAO.getInstance().insert(kh1);
//		
//		Test update
//		Date ns1 = Date.valueOf("1990-12-1");
//		KhachHang kh1 = new KhachHang(1, "GiaHuy", ns1, "TPHoChiMinh");
//		KhachHangDAO.getInstance().update(kh1);
//		
//		Test delete
//		KhachHang kh = new KhachHang(1, "", null, "");
//		KhachHangDAO.getInstance().delete(kh);
//		
//		Test selectall
//		ArrayList<KhachHang> list = KhachHangDAO.getInstance().selectAll();
//		for(KhachHang k : list) {
//			System.out.println(k.toString());
//		}
		
//		Test selectbyid
//		KhachHang find = new KhachHang();
//		find.setId(1);
//		KhachHang k = KhachHangDAO.getInstance().selectById(find);
//		System.out.println(k.toString());
		
//		Test selectbycondition
		ArrayList<KhachHang> list = KhachHangDAO.getInstance().selectByCondition("DiaChi LIKE \"%C%\"");
		for(KhachHang k : list) {
			System.out.println(k.toString());
		}
	}
}
