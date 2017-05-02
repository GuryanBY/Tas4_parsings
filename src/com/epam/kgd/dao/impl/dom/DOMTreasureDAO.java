package com.epam.kgd.dao.impl.dom;

import java.io.IOException;
import java.util.List;

import org.xml.sax.SAXException;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.TreasureDAO;
import com.epam.kgd.dao.exception.DAOException;

public class DOMTreasureDAO implements TreasureDAO {

	@Override
	public List<Treasure> getAllTreasure() throws DAOException {
		try {
			List<Treasure> list = DOMTreasureParser.getTreasureList();
			return list;
		} catch (SAXException | IOException e) {
			throw new DAOException("Problem at DOM parser.");
		}
		
	}

}
