package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.SightWords;
import com.rest.service.SightWordService;

@RestController
@RequestMapping(path="/rest")
public class SightWordsController {
	
	@Autowired
	private SightWordService sightWordService;
	@Autowired
	public SightWordsController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/greeting")
	public String greeting(){
		return "Welcome to spring boot restful service";
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/sightWords/{index}")
	public SightWords getSightWords(@PathVariable(value="index")int index){
	
		if(index>sightWordService.total())index=1;
		return sightWordService.getSightWord(index);
	}

	

}
