package com.mtech.mithun.mTestProject.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mtech.mithun.mTestProject.beas.Users;
import com.mtech.mithun.mTestProject.exception.UserNotFoundException;

@Component
public class MTestService {
	
	public static List<Users> userList=new ArrayList<Users>();
	
	static {
		userList.add(new Users(1,"mithun",new Date()));
		userList.add(new Users(2,"manu",new Date()));
		userList.add(new Users(3,"kavya",new Date()));
		userList.add(new Users(4,"manu",new Date()));
		userList.add(new Users(5,"appu",new Date()));
		
	}
	
	public List<Users> getUsers()
	{
		return userList;
	}
	public Users findUser(int id) throws UserNotFoundException
	{
		Users user=userList.stream().filter(user1-> user1.getId().intValue()== id).findAny().orElse(null);
		if(null==user) {
			throw new UserNotFoundException("User not found for ID"+id);
		}
		return user;
	}
}
