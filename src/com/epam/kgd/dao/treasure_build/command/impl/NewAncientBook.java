package com.epam.kgd.dao.treasure_build.command.impl;

import java.util.List;

import com.epam.kgd.bean.AncientBook;
import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;

public class NewAncientBook implements Command{

	@Override
	public Treasure execute(List<String> params) {

		AncientBook result = new AncientBook();
		
		result.setId(Integer.parseInt(params.get(1)));
		result.setTitle(params.get(2));
		result.setAge(Integer.parseInt(params.get(3)));
		result.setPrice(Double.parseDouble(params.get(4)));
		
		result.setType(params.get(5));
		result.setPages(Integer.parseInt(params.get(6)));
		result.setLanguage(params.get(7));
		
		return result;
	}

}
