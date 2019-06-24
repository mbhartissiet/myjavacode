package com.onlytrailcodeforselenium;

import java.util.HashSet;

public class DuplicateString {

	public static void main(String[] args) {
		
     String name[] = {"java","mahesh","ayansh","java","shambhu"};
     HashSet<String> hs = new HashSet<String>();
     for(String dup: name){
    	 if(hs.add(dup)==false){
    		 System.out.println("duplicate element   " +dup);
    		 
    	 }
     }

	}

}
