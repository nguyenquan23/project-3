package view;

import java.util.Collection;

import service.AdminService;
import service.AdminServiceImpl;
import service.PositionService;
import service.PositionServiceImpl;

public class PositionView {
	
	private static PositionService positionService;
	private static AdminService adminService;
	static {
		positionService = new PositionServiceImpl(); 
		adminService = new AdminServiceImpl();
	}
	public static void main(String[] args) {
	printf(positionService.getAll());
   printf(adminService.getAdmin());
		printf(adminService.getAllInspect());
		
	}
public static <E> void printf(Collection<E> collections) {
	collections.forEach(System.out::println);
}
}
