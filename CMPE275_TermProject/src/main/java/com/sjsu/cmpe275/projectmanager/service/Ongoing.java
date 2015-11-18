package com.sjsu.cmpe275.projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ongoing implements IState {

	@Autowired
	IState completed;
	
	public void execute(StateContext context) {
		System.out.println("Ongoing State Executed");
		context.setState(new Completed());
		completed.execute(context);
	}

}
