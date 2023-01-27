package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import laptrinhdoan.connection.HibernateProvider;

public class AbstractHibernateDao {
	 static SessionFactory sessionFactory;
	 public AbstractHibernateDao() {
   sessionFactory = HibernateProvider.getSessionFactory();
   
	}
	 Session openSession() {
			return	sessionFactory.openSession();
			}
	Session getCurrentSession() {
				return sessionFactory.getCurrentSession();
			}

}
