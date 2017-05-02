package com.epam.kgd.dao.treasure_build.command.impl;

import java.util.List;

import com.epam.kgd.bean.Princess;
import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;

public class NewPrincess implements Command{

	@Override
	public Treasure execute(List<String> params) {
		Princess result = new Princess();
		
		result.setId(Integer.parseInt(params.get(1)));
		result.setTitle(params.get(2));
		result.setAge(Integer.parseInt(params.get(3)));
		result.setPrice(Double.parseDouble(params.get(4)));
		result.setName(params.get(5));
		result.setDamnation(Boolean.parseBoolean(params.get(6)));
		result.setBirthPlace(params.get(7));
		return result;
	}

}
