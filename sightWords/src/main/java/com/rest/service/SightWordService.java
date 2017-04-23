package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.SightWords;
import com.rest.repo.SightWordRepository;

@Service
public class SightWordService {
	
	private SightWordRepository sightWordRepository;

	@Autowired
	public SightWordService(SightWordRepository sightWordRepository) {
		this.sightWordRepository = sightWordRepository;
	}
	
	public SightWords createSightWord(List<String> sightwords){
		return sightWordRepository.save(new SightWords(sightwords));
	}
	
	public SightWords getSightWord(int id){
		return sightWordRepository.findOne(id);
	}
	
	public Iterable<SightWords> lookup(){
		return sightWordRepository.findAll();
	}
	
	public long total(){
		return sightWordRepository.count();
	}
}
