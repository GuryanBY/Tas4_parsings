package com.epam.kgd.controller;

import com.epam.kgd.controller.command.Command;

public final class Controller {
	private static final Controller INSTANCE = new Controller();

	private Controller() {
	}

	private final CommandProvider provider = new CommandProvider();
	private final char delimeter = '@';

	public String executeTask(String request) {
		String commandName;
		Command executionCommand;

		commandName = request.substring(0, request.indexOf(delimeter));
		executionCommand = provider.getCommand(commandName);

		return executionCommand.execute(request);
	}

	public static Controller getControllerInstance() {
		return INSTANCE;
	}

}
