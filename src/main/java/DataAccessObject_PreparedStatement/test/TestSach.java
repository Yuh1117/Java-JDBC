package DataAccessObject_PreparedStatement.test;

import java.util.ArrayList;

import DataAccessObject_PreparedStatement.dao.SachDAO;
import DataAccessObject_PreparedStatement.model.Sach;

public class TestSach {
	public static void main(String[] args) {
//		Sach sach1 = new Sach("ID01", "OOP", 50000f, 2004);
//		Sach sach2 = new Sach("ID02", "DSA", 70000f, 1999);
//		Test insert
//		SachDAO.getInstance().insert(sach2);
//
//		 Test update
//		Sach sach2 = new Sach("ID02", "DSABC", 90000f, 1999);
//		SachDAO.getInstance().update(sach2);
//		
//		Test delete
//		Sach sach2 = new Sach("ID02","",1f,1);
//		SachDAO.getInstance().delete(sach2);
//		
//		Test selectall
//		ArrayList<Sach> list = SachDAO.getInstance().selectAll();
//		for(Sach s: list) {
//			System.out.println(s.toString());
//		}
		
//		Test selectbyid
//		Sach find = new Sach();
//		find.setId("ID01");
//		Sach s = SachDAO.getInstance().selectById(find);
//		System.out.println(s.toString());
		
//		Test selectbycondition
		ArrayList<Sach> list = SachDAO.getInstance().selectByCondition("GiaBan > 50000");
		for(Sach s: list) {
			System.out.println(s.toString());
		}
	}
}
