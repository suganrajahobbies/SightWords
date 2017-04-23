package com.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.SightWords;
import com.rest.service.SightWordService;

@SpringBootApplication

public class SightWordsApplication implements CommandLineRunner{
	
	@Autowired
	private SightWordService sightWordService;
	

	public static void main(String[] args) {
		SpringApplication.run(SightWordsApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		List<SightFromFile> sightList = new ArrayList<>();
		
		ObjectMapperJson obj = new ObjectMapperJson();
		sightList=obj.readJsonWithObjectMapper();
		
		for (SightFromFile sightWords : sightList) {
			sightWordService.createSightWord(sightWords.getSightwords());
		}
		
		
		System.out.println("Number of record in H2DB: "+sightWordService.total());	
		}
	}
