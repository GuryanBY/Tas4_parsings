package com.epam.kgd.service;

import java.util.List;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.service.exception.ServiceException;

public interface TreasureServiсe {
	Treasure mostExpensive() throws ServiceException;
	List<Treasure> oneType(String type)throws ServiceException;
	List<Treasure> inLimit(double min, double max)throws ServiceException;

}
