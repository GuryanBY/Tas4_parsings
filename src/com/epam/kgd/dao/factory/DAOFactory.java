package com.epam.kgd.dao.factory;

import com.epam.kgd.dao.TreasureDAO;
import com.epam.kgd.dao.impl.dom.DOMTreasureDAO;
//import com.epam.kgd.dao.impl.sax.SAXTreasureDAO;
//import com.epam.kgd.dao.impl.stax.StAXTreasureDAO;

public final class DAOFactory {
	private DAOFactory() {
	}

	private static final DAOFactory INSTANCE = new DAOFactory();

	//private final TreasureDAO treasureImpl = new SAXTreasureDAO();
	//private final TreasureDAO treasureImpl = new StAXTreasureDAO();
	private final TreasureDAO treasureImpl = new DOMTreasureDAO();
	

	public static DAOFactory getInstance() {
		return INSTANCE;
	}

	public TreasureDAO getTreasureDAO() {
		return treasureImpl;
	}

}
