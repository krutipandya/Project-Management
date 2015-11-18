package com.sjsu.cmpe275.projectmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Planning implements IState {

	@Autowired
	IState ongoing;
	
	public void execute(StateContext context) {
		System.out.println("Planning State Executed");
		context.setState(new Ongoing());
		ongoing.execute(context);
	}
}
