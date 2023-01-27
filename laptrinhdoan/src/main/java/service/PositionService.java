package service;

import java.util.List;

import persistence.Position;

public interface PositionService {
	List<Position> getAll();
	boolean checkLogin(String userName , String password);

}
