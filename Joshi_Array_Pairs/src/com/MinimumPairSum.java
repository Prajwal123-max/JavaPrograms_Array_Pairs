package com;

import java.util.Scanner;

public class MinimumPairSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		minimumPairSum(ar);
	}
	public static void minimumPairSum(int[] ar) {
		int min=Integer.MAX_VALUE;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]+ar[j])<min) {
					min=ar[i]+ar[j];
				}
			}
		}
		System.out.println("Minimum sum Pair is: "+min);
	}

}
