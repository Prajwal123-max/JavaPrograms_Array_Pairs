/*
 * Print all pairs of numbers from given an array where at least one of the element is prime number.
 */
package com;

import java.util.Scanner;

public class PairsWithPrimeNumberElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		pairsWithPrimeNumber(ar);
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void pairsWithPrimeNumber(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(isPrime(ar[i])||isPrime(ar[j])) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
}
