package com.epam.kgd.dao.treasure_build.command.impl;

import java.util.List;

import com.epam.kgd.bean.AncientScroll;
import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;


public class NewAncientScroll implements Command {
	@Override
	public Treasure execute(List<String> params) {
		AncientScroll result = new AncientScroll();
		
		result.setId(Integer.parseInt(params.get(1)));
		result.setTitle(params.get(2));
		result.setAge(Integer.parseInt(params.get(3)));
		result.setPrice(Double.parseDouble(params.get(4)));
		
		result.setContent(params.get(5));
		result.setSchoolType(params.get(6));
		return result;
	}

}
