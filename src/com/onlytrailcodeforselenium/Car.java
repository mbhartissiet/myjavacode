package com.onlytrailcodeforselenium;

public abstract class Car {
	int regno;
	 Car(int r){
		 regno=r;
		 System.out.println(regno);
	 }
	 void openTank(){
		 System.out.println("Fill the tank");
	 }
	 abstract void steering(int direction,int angle);
	 abstract void breaking(int force);

}
