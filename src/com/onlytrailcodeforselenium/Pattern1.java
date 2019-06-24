package com.onlytrailcodeforselenium;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int alphabet = 65;
        
        System.out.println("** Printing the pattern... **");
        for (int i = 0; i <= 5; i++)
        {
            for (int j = i; j >= i+1; j--)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }

	}

}
