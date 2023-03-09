package com.Day7.Day7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Day7.Day7.jdbc.Userjdbc;
import com.Day7.Day7.model.User;

@RestController
public class DemoController {
	@Autowired
	Userjdbc jd;
	
	private static final String[] value = null;
	@RequestMapping("home")
	public ModelAndView getHome()
	{
		return new ModelAndView("home");
	}
	@RequestMapping("register")
	public ModelAndView getRegister()
	{
		return new ModelAndView("register");
	}
	@RequestMapping("checkuser")
	public ModelAndView getcheckuser(@RequestParam("uname")String name)
	{
		System.out.println(name);
		return new ModelAndView("success");
	}
	@RequestMapping(value="finduser",method=RequestMethod.POST)
	public ModelAndView getFind(@RequestParam("uname")String name)
	{
		List<User> u=jd.getAllUsers();
		System.out.println(u);
		System.out.println(name);
		return new ModelAndView("success");
	}
	@RequestMapping("hello")
	public ModelAndView gethello()
	{
		return new ModelAndView("hello");
	}
	@RequestMapping("photo")
	public ModelAndView getphoto()
	{
		return new ModelAndView("photo");
	}
	

	
	
	
}
