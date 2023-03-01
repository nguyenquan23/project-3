package service;

import java.util.List;

import persistence.Admin;
import persistence.Inspect;

public interface AdminService {
	 void addPosition(String userName, String password, String name, int phone, String address);
     List<Inspect> getAllInspect();
     void deleteInspect(String id);
     Inspect getInspect(String id);
     void updateInspect(String name,int phone, String address,String id);
     List<Admin> getAdmin();
}
