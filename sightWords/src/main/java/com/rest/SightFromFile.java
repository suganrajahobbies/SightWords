package com.rest;

import java.util.ArrayList;
import java.util.List;

public class SightFromFile{
		private List<String> sightwords = new ArrayList<>();
		
		public SightFromFile() {
			// TODO Auto-generated constructor stub
		}
		SightFromFile(List<String> sightwords){
			this.sightwords=sightwords;
		}
		public List<String> getSightwords() {
			return sightwords;
		}
		public void setSightwords(List<String> sightwords) {
			this.sightwords = sightwords;
		}
}