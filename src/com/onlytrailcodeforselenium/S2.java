package com.onlytrailcodeforselenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2 {
	
	  
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many subject ?");
		int n = Integer.parseInt(br.readLine());
		int[] marks = new int[n];
		for(int i=0; i<n;i++){
			System.out.println("Enter marks:  ");
			marks[i]=Integer.parseInt(br.readLine());
			
		}
		int tot = 0;
		for(int i=0;i<n;i++){
			tot += marks[i];
			/*System.out.println("Total Marks =" +tot);
			float percent = (float)tot/n;
			System.out.println("Percentage = "+percent);
				*/
		}
		System.out.println("Total Marks =" +tot);
		float percent = (float)tot/n;
		System.out.println("Percentage = "+percent);
		
		
	}

}
