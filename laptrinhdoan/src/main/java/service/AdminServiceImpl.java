package service;

import java.util.List;

import dao.AdminDao;
import dao.HibernateAdminDao;
import persistence.Admin;
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
	@Override
	public void deleteInspect(String id) {
	 adminDao.deleteInspect(id);
		
	}
	@Override
	public Inspect getInspect(String id) {
		// TODO Auto-generated method stub
		return adminDao.getInspect(id);
	}
	@Override
	public void updateInspect(String name, int phone, String address, String id) {
		 adminDao.updateInspect(name, phone, address, id);
		
	}
	@Override
	public List<Admin> getAdmin() {
		
		return adminDao.getAdmin();
	}
}
