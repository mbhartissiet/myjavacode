package com.onlytrailcodeforselenium;

public class EncapsulatedTest {

	public static void main(String[] args) {

		Student obj=new Student();// Creating object of Student class by using new keyword.
		obj.setName("Amit"); // setting the value of variable.
		String studentName=obj.getName(); // reading the value of variable. 
		System.out.println(studentName); 

	}

}
