package com.mtech.mithun.mTestProject.controllers;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstBootController {
	
	@GetMapping(path = "/show" )
	public String show()
	{
		System.out.println("hello000000000000000000000000000000000000000000000000");
		ConcurrentHashMap<String, String> map=new ConcurrentHashMap<String,String>();
		map.put(null, null);
		return "hello";
	}

}
