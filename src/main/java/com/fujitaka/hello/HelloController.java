package com.fujitaka.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping
	public Hello hello() {
		return new Hello("Hello User!!");
	}

	@RequestMapping("/{name}")
	public Hello helloToName(@PathVariable String name) {
		return new Hello("Hello " + name + "!!");
	}
}
