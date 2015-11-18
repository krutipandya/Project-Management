package com.sjsu.cmpe275.projectmanager.service;

import org.springframework.stereotype.Service;

@Service
public class Completed implements IState {

	public void execute(StateContext context) {
		System.out.println("Completed State Executed");
	}

}
