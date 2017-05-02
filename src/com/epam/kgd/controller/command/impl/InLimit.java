package com.epam.kgd.controller.command.impl;

import java.util.List;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.controller.command.Command;
import com.epam.kgd.service.TreasureServiсe;
import com.epam.kgd.service.exception.ServiceException;
import com.epam.kgd.service.factory.ServiceFactory;

public class InLimit implements Command {

	@Override
	public String execute(String request) {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		TreasureServiсe objectTreasureService = serviceFactory.getTreasureServiсe();
		String response = null;
		try {
			String[] params = request.split("@");
			double min = Double.parseDouble(params[1]);
			double max = Double.parseDouble(params[2]);

			List<Treasure> list = objectTreasureService.inLimit(min, max);
			response = buildString(list);
			return response;

		} catch (ServiceException e) {
			response = "Error during finding max price";
		}
		return response;
	}

	private String buildString(List<Treasure> list) {
		String line;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			result.append(list.get(i).toString() + "\n");
		}
		line = result.toString();
		return line;
	}

}
