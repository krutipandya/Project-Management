package com.sjsu.cmpe275.projectmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sjsu.cmpe275.projectmanager.service.IState;
import com.sjsu.cmpe275.projectmanager.service.Planning;
import com.sjsu.cmpe275.projectmanager.service.StateContext;


@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	IState planning;
	
	@RequestMapping(value = { "/create" }, method = RequestMethod.POST)
	public void addPerson() {
		System.out.println("Project Created");
		
		StateContext context = new StateContext(planning);
		System.out.println("Context set to Planning");
		
		planning.execute(context);
		System.out.println("Project Created Successfully");
	}
}
