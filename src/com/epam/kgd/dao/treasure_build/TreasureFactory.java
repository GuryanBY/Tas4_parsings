package com.epam.kgd.dao.treasure_build;

import java.util.List;

import com.epam.kgd.bean.Treasure;
import com.epam.kgd.dao.treasure_build.command.Command;
import com.epam.kgd.dao.treasure_build.command.CommandProvider;

public final class TreasureFactory {
	private final CommandProvider provider = new CommandProvider();
	
	private final static TreasureFactory INSTANCE = new TreasureFactory();

	private TreasureFactory() {
	}

	public static TreasureFactory getInstance() {
		return INSTANCE;
	}

	public Treasure getTreasure(List<String> params) {
		String typeTreasure = params.get(0);
		Command executionCommand = provider.getCommald(typeTreasure);

		return executionCommand.execute(params);
	}
}
