package com.onlytrailcodeforselenium;

public class LeapYear {

	public static void main(String[] args) {
		
		int year= 2019;
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println("Year is a leap year...." +year);
				}else{
					System.out.println("Year is not a leap year...." +year);
				}
				
			}else{
				System.out.println("Year is a leap year...." +year);
			}
			
		}else{
			System.out.println("Year is not a leap year...." +year);
		}

	}

}
