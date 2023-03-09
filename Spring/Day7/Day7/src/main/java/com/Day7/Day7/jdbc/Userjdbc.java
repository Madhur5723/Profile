package com.Day7.Day7.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Day7.Day7.model.User;
@Repository
public class Userjdbc {
	public List<User>getAllUsers()
	{
		List<User> li=new ArrayList<User>();
		li.add(new User("mmm@com","Madhur","723232","India"));
		return li;
	}

}
