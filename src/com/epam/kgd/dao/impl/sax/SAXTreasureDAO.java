package com.epam.kgd.dao.impl.sax;

import java.io.IOException;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.TreasureDAO;
import com.epam.kgd.dao.exception.DAOException;

public class SAXTreasureDAO implements TreasureDAO {
	@Override
	public List<Treasure> getAllTreasure() throws DAOException {
		TreasureSaxHandler handler = new TreasureSaxHandler();
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(handler);
			reader.parse(new InputSource(RESOURСE_PATH));

		} catch (SAXException | IOException e) {
			e.printStackTrace();
			throw new DAOException("Problem at SAX parser.");
		}
		return handler.getTreasureList();
	}

}
