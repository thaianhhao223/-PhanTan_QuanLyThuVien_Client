package app;

import java.rmi.Naming;
import java.sql.Date;
import java.util.Arrays;
import java.util.HashSet;

import controller.SachController;
import dao.SachDao;
import entity.Sach;

public class AppClient {
	public static void main(String[] args) {
		
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null) {
			System.setProperty("java.security.policy", "policy/policy.policy");
			System.setSecurityManager(new SecurityManager());
		}
		
		try {
			SachDao sachDao = (SachDao) Naming.lookup("rmi://192.168.1.111:1099/sachDao");
			
//			Date date = Date.valueOf("1987-1-1");
//			Sach sach = new Sach("Rừng Na Uy", "Murakami Haruki", date, "Thai ANh Hao", 10, 5);
//			sach.setId(null);
////			Sach sach = new Sach("Sach002", "!001 đêm", "Aladin", date, "Kim Đồng", 0, null, 0);
//			if(sachDao.addSach(sach))
//				System.out.println("Thành công");
			
//			Sach sach = sachDao.getSachById("SACH20211121755330");
//			System.out.println(sach.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
//		Date date = Date.valueOf("1987-1-1");
//		Sach sach = new Sach("Rừng Na Uy", "Murakami Haruki", date, "Nhà sách Hà nội", 10, 5);
//		
//		SachController sachController = new SachController();
//		sachController.addSach(sach);
	}
}
