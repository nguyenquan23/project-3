package service;

import java.util.List;

import persistence.Inspect;

public interface AdminService {
	 void addPosition(String userName, String password, String name, int phone, String address);
     List<Inspect> getAllInspect();
     
}
