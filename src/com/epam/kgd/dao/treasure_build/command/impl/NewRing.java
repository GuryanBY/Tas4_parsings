package com.epam.kgd.dao.treasure_build.command.impl;

import java.util.List;

import com.epam.kgd.bean.Ring;
import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;

public class NewRing implements Command {

	@Override
	public Treasure execute(List<String> params) {
		Ring result = new Ring();
		
		result.setId(Integer.parseInt(params.get(1)));
		result.setTitle(params.get(2));
		result.setAge(Integer.parseInt(params.get(3)));
		result.setPrice(Double.parseDouble(params.get(4)));
		
		result.setMaterial(params.get(5));
		result.setWeight(Double.parseDouble(params.get(6)));
		result.setStyle(params.get(7));
		result.setHasPreciousStone(Boolean.parseBoolean(params.get(8)));
		
		return result;
	}

}
