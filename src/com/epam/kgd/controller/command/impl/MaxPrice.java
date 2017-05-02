package com.epam.kgd.controller.command.impl;

import com.epam.kgd.controller.command.Command;
import com.epam.kgd.service.TreasureServiсe;
import com.epam.kgd.service.exception.ServiceException;
import com.epam.kgd.service.factory.ServiceFactory;

public class MaxPrice implements Command {

	@Override
	public String execute(String request) {

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		TreasureServiсe objectTreasureService = serviceFactory.getTreasureServiсe();
		String response = null;
		try {
			response = objectTreasureService.mostExpensive().toString();
			return response;
		} catch (ServiceException e) {
			response="Error during finding max price";
		}
		return response;

	}

}
