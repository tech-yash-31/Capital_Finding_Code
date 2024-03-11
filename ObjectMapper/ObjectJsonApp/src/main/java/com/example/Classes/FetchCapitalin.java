package com.example.Classes;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchCapitalin {
	
	 public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	        String json = "{ \"page\": 1, \"per_page\": 10, \"total\": 1, \"total_pages\": 1, " +
	                "\"data\": " +
	                "[ { \"name\": \"Italy\", \"nativeName\": \"Italia\", \"topLevelDomain\": [ \".it\" ], \"alpha2Code\": \"IT\", \"numericCode\": \"380\", \"alpha3Code\": \"ITA\", \"currencies\": [ \"EUR\" ], \"callingCodes\": [ \"39\" ], \"capital\": \"Rome\", " +
	                "\"altSpellings\": " +
	                "[ \"IT\", \"Italian Republic\", \"Repubblica italiana\" ], " +
	                "\"relevance\": \"2\", \"region\": \"Europe\", \"subregion\": \"Southern Europe\", \"language\": [ \"Italian\" ], " +
	                "\"languages\": [ \"it\" ], \"translations\": { \"de\": \"Italien\", \"es\": \"Italia\", \"fr\": \"Italie\", \"it\": \"Italia\", " +
	                "\"ja\": \"イタリア\", \"nl\": \"Italië\", \"hr\": \"Italija\" }, \"population\": 60753794, " +
	                "\"latlng\": [ 42.83333333, 12.83333333 ], \"demonym\": \"Italian\", \"borders\": [ \"AUT\", \"FRA\", \"SMR\", \"SVN\", \"CHE\", \"VAT\" ], \"area\": 301336, \"gini\": 36, \"timezones\": [ \"UTC+01:00\" ] } ] }";

	        ObjectMapper objectMapper = new ObjectMapper();
	       
	            JsonNode jsonNode = objectMapper.readTree(json);
	     
	            	JsonNode node1 =  jsonNode.get("data").get(0);
	            	String Capital =  node1.get("capital").asText();
	   
	            	System.out.println(Capital);
	 }
}