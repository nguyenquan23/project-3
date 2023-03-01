package dao;

import java.nio.charset.StandardCharsets;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.mysql.cj.Query;

import laptrinhdoan.connection.HibernateProvider;

public class AbstractHibernateDao {
	static SessionFactory sessionFactory;

	public AbstractHibernateDao() {
		sessionFactory = HibernateProvider.getSessionFactory();

	}

	Session openSession() {
		return sessionFactory.openSession();
	}

	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public static <T> void getParameter(NativeQuery<T> query, Object... parameters) {
	   int index  = 0;
		for (int i = 0; i < parameters.length; i++) {
			Object parameter = parameters[i];
			index = i+1;
			if(parameter instanceof String) {
				
				System.out.println((String)parameter);
				query.setParameter(i+1, (String)parameter);
				
			}
			else if (parameter instanceof Integer) {
				query.setParameter(i+1, (String)parameter);
				
			}
			

		}

	}
	public static String convert(String s) {
		byte[] bytes = s.getBytes(StandardCharsets.ISO_8859_1);
		s = new String(bytes, StandardCharsets.UTF_8);
		return s;
	}

}
