package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlackController {

	@RequestMapping(value="/slack", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String getResponse(@RequestParam("text") String text)
	{
		if(text.startsWith("AO2"))
		return "Hello., You have entered AOReference number and it is ->"+text;
		
		else if(text.startsWith("789"))
			return "Hello., You have entered SAP number and it is ->"+text;
		else
			return "Hello., You have entered invalid number and it is ->"+text;
	}
}
