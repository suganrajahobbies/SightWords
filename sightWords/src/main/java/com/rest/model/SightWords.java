package com.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class SightWords {

	@Id
	@GeneratedValue
	private int id;
	
	@ElementCollection
	private List<String> sightwords =new ArrayList<>();

	public SightWords() {
	
		// TODO Auto-generated constructor stub
	}

	public SightWords(List<String> sightwords) {
		this.sightwords = sightwords;
	}

	public int getId() {
		return id;
	}

	
	public List<String> getSightwords() {
		return sightwords;
	}

	public void setSightwords(List<String> sightwords) {
		this.sightwords = sightwords;
	}

	@Override
	public String toString() {
		return "SightWords [sightwords=" + sightwords + "]";
	}
}
