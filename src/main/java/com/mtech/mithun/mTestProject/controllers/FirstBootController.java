package com.mtech.mithun.mTestProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstBootController {
	
	@GetMapping(path = "/show" )
	public String show()
	{
		System.out.println("hello000000000000000000000000000000000000000000000000");
		return "hello";
	}

}
