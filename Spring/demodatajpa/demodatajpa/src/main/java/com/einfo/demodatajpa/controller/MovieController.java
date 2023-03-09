package com.einfo.demodatajpa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.demodatajpa.dao.Moviedao;
import com.einfo.demodatajpa.model.Movie;

import jakarta.servlet.http.HttpServletRequest;

@RestController

public class MovieController {
	@Autowired
	Moviedao md;
	
	@RequestMapping("home")
	public ModelAndView getHome()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping("addmovie")
	public ModelAndView getaddmovie()
	{
		return new ModelAndView("addmovie");
	}
	
	@RequestMapping(value="insertmovie",method=RequestMethod.POST)
	public ModelAndView getinsertmovie(HttpServletRequest req,@RequestParam("mname") String moviename,@RequestParam("lang") String Lang)
	
	{
		//int movieId=Integer.parseInt(req.getParameter("mid"));
		Movie m=new Movie(0,moviename,req.getParameter("director"),Lang);
		
		//USerDao
		md.save(m);
		
		System.out.println(m);
		return new ModelAndView("Success");
	}
	@RequestMapping("viewMovie")
	public ModelAndView getviewmovie()
	{
		ModelAndView mv=new ModelAndView("viewmovie");
		List<Movie> li=md.findAll();
		mv.addObject("movies",li);
		return mv;
	}
	

}

