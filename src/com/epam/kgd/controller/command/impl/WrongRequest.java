package com.epam.kgd.controller.command.impl;

import com.epam.kgd.controller.command.Command;

public class WrongRequest implements Command{

	@Override
	public String execute(String request) {
		String responce = "Wrong request!";
		return responce;
	}

}
