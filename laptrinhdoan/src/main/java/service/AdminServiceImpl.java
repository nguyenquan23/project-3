package service;

import java.util.List;

import dao.AdminDao;
import dao.HibernateAdminDao;
import persistence.Inspect;

public class AdminServiceImpl implements AdminService{
	AdminDao adminDao;
	public AdminServiceImpl() {
		adminDao = new HibernateAdminDao();
	}
	
	@Override
	public void addPosition(String userName, String password, String name, int phone, String address) {
		adminDao.addPosition(userName, password, name, phone, address);
		
	}
	@Override
	public List<Inspect> getAllInspect() {
		
		return adminDao.getAllInspect();
	}
}
