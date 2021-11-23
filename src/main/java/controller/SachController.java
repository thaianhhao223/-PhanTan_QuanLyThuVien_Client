package controller;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Date;

import dao.SachDao;
import entity.Sach;

public class SachController {
	SecurityManager securityManager = System.getSecurityManager();
	SachDao sachDao;
	public SachController() {
		if(securityManager == null) {
			System.setProperty("java.security.policy", "policy/policy.policy");
			System.setSecurityManager(new SecurityManager());
			
		}
		try {
			sachDao = (SachDao) Naming.lookup("rmi://192.168.1.111:1099/sachDao");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean addSach(Sach sach) {
		try {
			
			if(sachDao.addSach(sach))
				System.out.println("Thành công");
//			Sach sach = sachDao.getSachById("SACH20211121755330");
//			System.out.println(sach.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
		
	}
}
