package com.epam.kgd.dao.impl.stax;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.TreasureFactory;

public class StAXTreasureParser {

	public static List<Treasure> process(XMLStreamReader reader) throws XMLStreamException {
		List<Treasure> list = new ArrayList<>();
		TreasureFactory factory = TreasureFactory.getInstance();
		List<String> params = new ArrayList<>();
		String temp = "";

		while (reader.hasNext()) {
			int type = reader.next();

			switch (type) {
			case XMLStreamConstants.START_ELEMENT:

				if ((reader.getAttributeCount() != 0)) {
					params.clear();
					temp = reader.getLocalName();
					params.add(temp);
					params.add(1, reader.getAttributeValue(0));
				}
				break;
			case XMLStreamConstants.CHARACTERS:
				String text = reader.getText().trim();
				if (!text.isEmpty()) {
					params.add(text);
				}
				break;
			case XMLStreamConstants.END_ELEMENT:

				if (reader.getLocalName().equals(temp)) {
					list.add(factory.getTreasure(params));
				}
				break;
			}
		}

		return list;
	}
}
