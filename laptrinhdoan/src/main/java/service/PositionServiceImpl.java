package service;

import java.util.List;

import dao.HibernatePositionDao;
import dao.PositionDao;
import persistence.Position;

public class PositionServiceImpl implements PositionService {
	PositionDao positionDao;

	public PositionServiceImpl() {
		positionDao = new HibernatePositionDao();
	}

	@Override
	public List<Position> getAll() {
		return positionDao.getAll();
	}

	@Override
	public boolean checkLogin(String userName, String password) {

		return positionDao.checkLogin(userName, password);
	}
}
