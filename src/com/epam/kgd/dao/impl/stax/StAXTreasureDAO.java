package com.epam.kgd.dao.impl.stax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.TreasureDAO;
import com.epam.kgd.dao.exception.DAOException;

public class StAXTreasureDAO implements TreasureDAO {

	@Override
	public List<Treasure> getAllTreasure() throws DAOException {
		try {
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			InputStream input = new FileInputStream(RESOURСE_PATH);
			XMLStreamReader reader = inputFactory.createXMLStreamReader(input);

			List<Treasure> list = StAXTreasureParser.process(reader);
			return list;
		} catch (FileNotFoundException | XMLStreamException e) {
			throw new DAOException("Problem at StAX parser.");
		}

	}

}
