package com.mtech.mithun.mTestProject.controllers;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.mtech.mithun.mTestProject.beas.Users;
import com.mtech.mithun.mTestProject.exception.UserNotFoundException;
import com.mtech.mithun.mTestProject.service.MTestService;

@RestController
public class FirstBootController {
	
	Logger logger=LoggerFactory.getLogger(FirstBootController.class);
	
	@Autowired
	MTestService service;
	
	@Autowired
	MessageSource messageSource;
	
	@GetMapping(path = "/show" )
	public String show(@RequestHeader(name="accept_language",required=false) Locale locale )
	{
		logger.error("mithun error");
				System.out.println("hello000000000000000000000000000000000000000000000000");
//		ConcurrentHashMap<String, String> map=new ConcurrentHashMap<String,String>();
//		map.put(null, null);
		return messageSource.getMessage("good.morning.message", null, locale);
	}
	@GetMapping(path="/showAllUser")
	public List<Users> getAllUsers()
	{
		return service.getUsers();
	}
	
	@GetMapping(path="/findUser/{id}")
	public Users findUser(@PathVariable int id) throws UserNotFoundException
	{
		
		return service.findUser(id);
		
	}
	
}
