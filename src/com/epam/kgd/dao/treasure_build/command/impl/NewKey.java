package com.epam.kgd.dao.treasure_build.command.impl;

import java.util.List;

import com.epam.kgd.bean.Key;
import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;

public class NewKey implements Command {

	@Override
	public Treasure execute(List<String> params) {
		Key result = new Key();
		
		result.setId(Integer.parseInt(params.get(1)));
		result.setTitle(params.get(2));
		result.setAge(Integer.parseInt(params.get(3)));
		result.setPrice(Double.parseDouble(params.get(4)));
		result.setSize(Integer.parseInt(params.get(5)));
		result.setType(params.get(6));
		result.setWhatOpen(params.get(7));
		return result;
	}

}
