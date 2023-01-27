package dao;

import java.util.List;

import persistence.Position;

public interface PositionDao {
List<Position> getAll();
boolean checkLogin(String username, String password);
}
