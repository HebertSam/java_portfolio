package com.project.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class protfolioControl{
	//Member variables go here

	public protfolioControl(){

	}
	
	@RequestMapping("")
	public String index(){
		return "index";
    }
    @RequestMapping("me")
    public String me(){
        return "aboutMe";
    }	
    @RequestMapping("projects")
    public String project(){
        return "projects";
    }
}