package com.epam.kgd.dao.treasure_build.command;

import java.util.HashMap;
import java.util.Map;

import com.epam.kgd.dao.treasure_build.command.impl.NewAncientBook;
import com.epam.kgd.dao.treasure_build.command.impl.NewAncientScroll;
import com.epam.kgd.dao.treasure_build.command.impl.NewJewel;
import com.epam.kgd.dao.treasure_build.command.impl.NewKey;
import com.epam.kgd.dao.treasure_build.command.impl.NewPrincess;
import com.epam.kgd.dao.treasure_build.command.impl.NewRing;
import com.epam.kgd.dao.treasure_build.command.impl.WrongType;

public class CommandProvider {
	private final Map<TreasureType, Command> repository = new HashMap<>();

	public CommandProvider() {
		repository.put(TreasureType.ANCIENT_BOOK, new NewAncientBook());
		repository.put(TreasureType.ANCIENT_SCROLL, new NewAncientScroll());
		repository.put(TreasureType.JEWEL, new NewJewel());
		repository.put(TreasureType.KEY, new NewKey());
		repository.put(TreasureType.PRINCESS, new NewPrincess());
		repository.put(TreasureType.RING, new NewRing());
		repository.put(TreasureType.WRONG_TYPE, new WrongType());
	}

	public Command getCommald(String type) {
		TreasureType treasureType = null;
		Command command = null;
		try {
			treasureType = TreasureType.valueOf(type.toUpperCase());
			command = repository.get(treasureType);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = repository.get(TreasureType.WRONG_TYPE);
		}
		return command;

	}

}
