package laptrinhdoan.connection;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import persistence.Position;

public class HibernateProvider {
	private static String path = "hibernate.cfg.xml";
	private static SessionFactory sessionFactory ;
	public HibernateProvider() {
		
	}
	public static SessionFactory getSessionFactoryAsJava() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			
			sessionFactory = configuration.setProperties(getProps()).buildSessionFactory();
			configuration.addAnnotatedClass(Position.class);
			
		}
		return sessionFactory;
	}
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			
			sessionFactory = configuration.configure(path).buildSessionFactory();
			
		}
		return sessionFactory;
	}
	private static Properties getProps() {
		Properties props = new Properties();
		
		props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		props.put(Environment.URL, "jdbc:mysql://localhost:3306/foodmanagement");
		props.put(Environment.USER, "root");
		props.put(Environment.PASS, "quan1234");
		
		props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		props.put(Environment.SHOW_SQL, "true");
		props.put(Environment.FORMAT_SQL, "true");
		props.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		
		
		 return props;
	}

}
