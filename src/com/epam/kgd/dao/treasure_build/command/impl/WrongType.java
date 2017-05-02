package com.epam.kgd.dao.treasure_build.command.impl;

import java.util.List;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;

public class WrongType implements Command{

	@Override
	public Treasure execute(List<String> params) {
		return null;
	}

}
