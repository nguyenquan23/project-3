package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import persistence.Admin;
import persistence.Inspect;

public class HibernateAdminDao extends AbstractHibernateDao implements AdminDao {
	private String ADD_INSPECT = "CALL p_Them_ThanhTra(:username,:password,:name,:phone,:address)";
	private String DELETE_INSPECT = "DELETE FROM thanh_tra WHERE id = :id ";
	private String GET_ALL_INSPECT = "SELECT * FROM thanh_tra";
	private String GET_INSPECT = "SELECT * FROM thanh_tra WHERE id = :id";
	private String UPDATE_INSPECT = "UPDATE  thanh_tra SET ten = :name ,sodienthoai = :phone, diachi =:address WHERE id =:id ";
	private String GET_ADMIN = "SELECT * FROM admin";

	@Override
	public void addPosition(String userName, String password, String name, int phone, String address) {
		Session session = openSession();
		session.beginTransaction();

		session.createSQLQuery(ADD_INSPECT).setParameter("username", userName).setParameter("password", password)
				.setParameter("name", name).setParameter("phone", phone).setParameter("address", address)
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

	@Override
	public void deleteInspect(String id) {

		Session session = openSession();
		session.beginTransaction();

		session.createSQLQuery(DELETE_INSPECT).setParameter("id", id).executeUpdate();
		session.getTransaction().commit();

	}

	@Override
	public Inspect getInspect(String id) {

		Session session = openSession();
		NativeQuery<Inspect> query = session.createNativeQuery(GET_INSPECT, Inspect.class).setParameter("id", id);

		Inspect inspect = query.getSingleResult();
		return inspect;
	}

	@Override
	public void updateInspect(String name, int phone, String address, String id) {
		Session session = openSession();
		session.beginTransaction();
		session.createSQLQuery(UPDATE_INSPECT).setParameter("name", name).setParameter("phone", "567")
				.setParameter("address", address).setParameter("id", id).executeUpdate();
		session.getTransaction().commit();
	}

	@Override
	public List<Admin> getAdmin() {
		Session session = openSession();
		NativeQuery<Admin> admins = session.createNativeQuery(GET_ADMIN, Admin.class);
	  List<Admin> result = admins.getResultList();
	  return result;
	}
}
