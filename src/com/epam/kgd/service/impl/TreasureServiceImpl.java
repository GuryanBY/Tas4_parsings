package com.epam.kgd.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.TreasureDAO;
import com.epam.kgd.dao.exception.DAOException;
import com.epam.kgd.dao.factory.DAOFactory;
import com.epam.kgd.service.TreasureServiсe;
import com.epam.kgd.service.exception.ServiceException;

public class TreasureServiceImpl implements TreasureServiсe {
	@Override
	public Treasure mostExpensive() throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		TreasureDAO treasureDAO = daoObjectFactory.getTreasureDAO();
		try {
			// validation!!!!!!!!!!!!!!
			List<Treasure> allTreasures = treasureDAO.getAllTreasure();

			Treasure max = allTreasures.get(0);
			double maxPrice = max.getPrice();

			for (int i = 1; i < allTreasures.size(); i++) {
				if (allTreasures.get(i).getPrice() > maxPrice) {
					max = allTreasures.get(i);
				}
			}
			return max;

		} catch (DAOException e) {
			e.printStackTrace();
			String message = "Problem at Service.";
			throw new ServiceException(message);
		}

	}

	@Override
	public List<Treasure> oneType(String type) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		TreasureDAO treasureDAO = daoObjectFactory.getTreasureDAO();
		try {
			// validation!!!!!!!!!!!!!!

			List<Treasure> allTreasures = treasureDAO.getAllTreasure();
			List<Treasure> result = new ArrayList<>();

			for (int i = 0; i < allTreasures.size(); i++) {
				String typeClass = allTreasures.get(i).getClass().getSimpleName();

				if (typeClass.equalsIgnoreCase(type)) {
					result.add(allTreasures.get(i));
				}
			}

			return result;
		} catch (DAOException e) {
			e.printStackTrace();
			String message = "Problem at Service.";
			throw new ServiceException(message);
		}
	}

	@Override
	public List<Treasure> inLimit(double min, double max) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		TreasureDAO treasureDAO = daoObjectFactory.getTreasureDAO();
		try {
			// validation!!!!!!!!!!!!!!
			List<Treasure> allTreasures = treasureDAO.getAllTreasure();
			List<Treasure> result = new ArrayList<>();

			for (int i = 0; i < allTreasures.size(); i++) {
				double forCompare = allTreasures.get(i).getPrice();

				if (forCompare >= min && forCompare <= max) {
					result.add(allTreasures.get(i));
				}
			}
			return result;

		} catch (DAOException e) {
			e.printStackTrace();
			String message = "Problem at Service.";
			throw new ServiceException(message);
		}
	}

}
