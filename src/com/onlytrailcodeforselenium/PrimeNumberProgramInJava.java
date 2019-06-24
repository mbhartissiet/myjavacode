package com.onlytrailcodeforselenium;


public class PrimeNumberProgramInJava {
	public static boolean isPrime(int n) {
		// prime must be greater than 1
		if (n <= 1) {
		return false;
		}
		int numberOfDivisor = 0;
		for (int i = 1; i <= n; i++) {
		if (n % i == 0) {
		numberOfDivisor++;
		}
		}
		// Divisor is only 1 and itself.
		return numberOfDivisor == 2;
		}
	public static void main(String[] args) {
		for (int n = 2; n <= 100; n++) {
		if (isPrime(n)) {
		System.out.print(n + " ");
		}
		}
		}
}
