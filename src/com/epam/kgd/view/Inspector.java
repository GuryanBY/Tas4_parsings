package com.epam.kgd.view;

import com.epam.kgd.controller.Controller;

public class Inspector {

	public static void main(String[] args) {

		Controller controller = Controller.getControllerInstance();
		String request;
		String response;

		// request = "max_price@";
		// request = "in_limit@0@30@";
		request = "type@AncientScroll@";

		response = controller.executeTask(request);

		System.out.println(response);

	}

}
