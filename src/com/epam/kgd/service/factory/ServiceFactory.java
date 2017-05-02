package com.epam.kgd.service.factory;

import com.epam.kgd.service.TreasureServiсe;
import com.epam.kgd.service.impl.TreasureServiceImpl;

public class ServiceFactory {
	private ServiceFactory() {

	}

	private static final ServiceFactory INSTANCE = new ServiceFactory();

	public static ServiceFactory getInstance() {
		return INSTANCE;
	}
	private final TreasureServiсe treasureService = new TreasureServiceImpl();

	public TreasureServiсe getTreasureServiсe() {
		return treasureService;
	}

}
