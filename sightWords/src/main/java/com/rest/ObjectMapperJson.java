package com.rest;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperJson {

	    public List<SightFromFile> readJsonWithObjectMapper() throws IOException {
	        ObjectMapper objectMapper = new ObjectMapper();
	        List<SightFromFile> sightFromFileList = objectMapper.readValue(SightFromFile.class.getResourceAsStream("/sightwords.json"),
	        		new TypeReference<List<SightFromFile>>(){});
	        return sightFromFileList;
	    }

}
