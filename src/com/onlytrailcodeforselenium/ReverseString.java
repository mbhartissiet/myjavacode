package com.onlytrailcodeforselenium;

public class ReverseString {

	public static void main(String[] args) {

      String s= "Welcome to Kabloom";
      StringBuffer g = new StringBuffer();
      g = g.append(s);
     StringBuffer k= g.reverse();
      //int lengt = s.length();
    /* String  reverse = "";
     for(int i=length-1; i>=0;i--){
    	 reverse= reverse+s.charAt(i);
   
	}
     System.out.println(reverse)*/;
     System.out.println(k);

}
}
