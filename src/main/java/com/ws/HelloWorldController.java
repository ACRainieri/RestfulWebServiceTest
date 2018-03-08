package com.ws;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// Return a simple String
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	// Return a bean in JSON format
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
	private HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

	// Passing a variable
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world/path-variable/{name}")
	private HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World Bean, %s", name));
	}
}
