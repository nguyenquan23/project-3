package view;

import java.util.Collection;

import service.PositionService;
import service.PositionServiceImpl;

public class PositionView {
	
	private static PositionService positionService;
	static {
		positionService = new PositionServiceImpl(); 
	}
	public static void main(String[] args) {
		printf(positionService.getAll());
		
	}
public static <E> void printf(Collection<E> collections) {
	collections.forEach(System.out::println);
}
}
