package com.vin.stanford.controller;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class WelcomeAction extends ActionSupport implements Preparable	
{
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(WelcomeAction.class);
	
	public String execute()
	{
		return "welcome";
	}

	@Override
	public void prepare() throws Exception {
		
	}

}
