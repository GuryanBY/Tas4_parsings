package com.epam.kgd.dao.treasure_build.command;

import java.util.List;

import com.epam.kgd.bean.Treasure;

public interface Command {
	public Treasure execute (List<String> params);
}
