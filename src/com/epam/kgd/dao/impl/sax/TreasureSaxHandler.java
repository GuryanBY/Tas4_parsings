package com.epam.kgd.dao.impl.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.TreasureFactory;


public class TreasureSaxHandler extends DefaultHandler {
	private List<Treasure> treasureList = new ArrayList<>();
	private StringBuilder text;
	private TreasureFactory factory = TreasureFactory.getInstance();
	private List<String> params = new ArrayList<>();
	private String temp = "";

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		text = new StringBuilder();
		String flag = attributes.getValue("id");
		temp = qName;
		if (flag != null) {
			params.clear();
			params.add(qName);
			params.add(1, flag);
		}

	}

	public void endElement(String uri, String localName, String qName) throws SAXException {

		if (temp.equals(qName)) {
			params.add(text.toString());
			return;
		}
		temp = "";
		if (!qName.equals("treasures")) {
			treasureList.add(factory.getTreasure(params));

		}
	}

	public void characters(char[] buffer, int start, int length) {
		text.append(buffer, start, length);

	}

	public List<Treasure> getTreasureList() {
		return treasureList;
	}

}
