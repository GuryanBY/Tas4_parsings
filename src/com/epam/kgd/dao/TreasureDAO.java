package com.epam.kgd.dao;

import java.util.List;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.exception.DAOException;

public interface TreasureDAO {
	
	String RESOURСE_PATH = "src/res/my_treasures.xml";
	List<Treasure> getAllTreasure() throws DAOException;
}
