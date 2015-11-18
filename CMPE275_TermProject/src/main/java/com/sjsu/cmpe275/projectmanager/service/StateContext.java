package com.sjsu.cmpe275.projectmanager.service;

import org.springframework.stereotype.Service;


public class StateContext {

	IState state = null;

	public StateContext(){
		
	}
	
	public StateContext(IState state) {
		this.state = state;
	}

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}		
}
