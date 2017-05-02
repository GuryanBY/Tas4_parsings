package com.epam.kgd.controller;

import java.util.HashMap;
import java.util.Map;

import com.epam.kgd.controller.command.Command;
import com.epam.kgd.controller.command.impl.InLimit;
import com.epam.kgd.controller.command.impl.MaxPrice;
import com.epam.kgd.controller.command.impl.OneType;
import com.epam.kgd.controller.command.impl.WrongRequest;

final class CommandProvider {
	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put(CommandName.MAX_PRICE, new MaxPrice());
		repository.put(CommandName.TYPE, new OneType());
		repository.put(CommandName.IN_LIMIT, new InLimit());
		repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
	}

	Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;

		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = repository.get(CommandName.WRONG_REQUEST);
		}

		return command;
	}
}
