package com.epam.kgd.dao.treasure_build.command.impl;

import java.util.List;

import com.epam.kgd.bean.Jewel;
import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;

public class NewJewel implements Command{

	@Override
	public Treasure execute(List<String> params) {
		
		Jewel result = new Jewel();
		
		result.setId(Integer.parseInt(params.get(1)));
		result.setTitle(params.get(2));
		result.setAge(Integer.parseInt(params.get(3)));
		result.setPrice(Double.parseDouble(params.get(4)));
		result.setjType(params.get(5));
		result.setMaterial(params.get(6));
		result.setDiameter(Double.parseDouble(params.get(7)));
		result.setWeight(Double.parseDouble(params.get(8)));
		
		return result;
	}

}
