package com.epam.kgd.dao.impl.dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.TreasureDAO;
import com.epam.kgd.dao.treasure_build.TreasureFactory;

public class DOMTreasureParser {

	public static List<Treasure> getTreasureList() throws SAXException, IOException {

		List<Treasure> list = new ArrayList<>();
		List<String> params = new ArrayList<>();
		TreasureFactory factory = TreasureFactory.getInstance();

		DOMParser parser = new DOMParser();
		parser.parse(TreasureDAO.RESOURСE_PATH);

		Document document = parser.getDocument();
		Element root = document.getDocumentElement();
		NodeList childNodes = root.getChildNodes();

		for (int i = 0; i < childNodes.getLength(); i++) {
			Node node = childNodes.item(i);

			if ((node.getNodeType() == Node.ELEMENT_NODE) && (node.hasAttributes())) {

				params.clear();
				params.add(node.getNodeName());
				params.add(1, ((Element) node).getAttribute("id"));

				String[] nodeTextLine = node.getTextContent().split("\t");
				for (String temp : nodeTextLine) {
					if (!temp.trim().isEmpty()) {
						params.add(temp.trim());
					}
				}
				if (!params.isEmpty()) {
					list.add(factory.getTreasure(params));
				}
			}
		}

		return list;
	}

}
