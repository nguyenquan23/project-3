package dao;

import java.util.List;

import persistence.Inspect;

public interface AdminDao {
	void addPosition(String userName, String password, String name, int phone, String address);
	List<Inspect> getAllInspect();
	

}
