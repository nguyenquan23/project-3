package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Admin;
import persistence.Position;

public class HibernatePositionDao extends AbstractHibernateDao implements PositionDao{
	private String GET_ALL_POSITIONS = "SELECT * FROM chucvu ";
	private String CHECK_LOGIN ="SELECT * FROM admin WHERE tai_khoan = :username AND mat_khau = :password";
	@Override
	public boolean checkLogin(String userName ,String password) {
		Session session = openSession();
		NativeQuery<Admin> query = session.createNativeQuery(CHECK_LOGIN,Admin.class);
		query.setParameter("username",userName );
		query.setParameter("password",password);
		List<Admin> list = query.getResultList();
		if(list.size() == 0) {
		 return false;
		}
		
		return true;
		
	}
	
	@Override
	public List<Position> getAll() {
		Session session = openSession();
		NativeQuery<Position> query = session.createNativeQuery(GET_ALL_POSITIONS, Position.class);
		List<Position> results = query.getResultList();
		return results;
	}

}
