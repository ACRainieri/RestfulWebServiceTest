package com.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//Return a simple String
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	//Return a bean in JSON format
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
	private HelloWorldBean helloWorldBean(String string) {
		return new HelloWorldBean("Hello World Bean");
	}
}
