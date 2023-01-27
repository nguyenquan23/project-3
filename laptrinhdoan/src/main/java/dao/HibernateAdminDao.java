package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Inspect;

public class HibernateAdminDao extends AbstractHibernateDao implements AdminDao {
	private String ADD_POSITION = "CALL p_Them_ThanhTra(:username,:password,:name,:phone,:address)";
	private String GET_ALL_INSPECT ="SELECT * FROM thanhtra";
	@Override
	public void addPosition(String userName, String password, String name, int phone, String address) {
		Session session = openSession();
		session.beginTransaction();
		session.createSQLQuery(ADD_POSITION).setParameter("username", userName)
		                                    .setParameter("password", password)
		                                    .setParameter("name", name)
		                                    .setParameter("phone", phone)
		                                    .setParameter("address", address)
		                                    .executeUpdate();
		                                    
	
		session.getTransaction().commit();
	
 
		
	}
@Override
public List<Inspect> getAllInspect() {
	Session session = openSession();
  NativeQuery<Inspect> query = session.createNativeQuery(GET_ALL_INSPECT, Inspect.class);
	List<Inspect> list = query.getResultList();
	return list;
}
}
