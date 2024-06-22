package test;

import dao.UserDAO;
import model.User;

public class TestUser {
	public static void main(String[] args) {
//		User u1 = new User("u1", "123", "Huy");
//		UserDAO.getInstance().insert(u1);
		
//		User u_find = new User("u1", "u123", "UUU");
//		User u_result = UserDAO.getInstance().selectById(u_find); 
//		System.out.println(u_result);
		
		User u_find = new User("x\' or 1=1 -- ","","");
		User u_result = UserDAO.getInstance().selectById(u_find); 
		System.out.println(u_result);
	}
}
