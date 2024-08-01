/*
 * count all possible pairs.
 */
package com;

import java.util.Scanner;

public class CountingPairs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		countingPossiblePairs(ar);
	}
	public static void countingPossiblePairs(int[] ar) {
		int count=0;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				count++;
			}
		}
		System.out.println(count);
	}

}
