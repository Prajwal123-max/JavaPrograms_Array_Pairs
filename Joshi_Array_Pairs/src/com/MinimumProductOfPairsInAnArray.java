package com;

import java.util.Scanner;

public class MinimumProductOfPairsInAnArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		minimumProductPairs(ar);
	}
	public static void minimumProductPairs(int[] ar) {
		int min=Integer.MAX_VALUE;
		int index1=0,index2=0;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]*ar[j])<min) {
					min=ar[i]*ar[j];
					index1=i;
					index2=j;
				}
			}
		}
		System.out.println("minimum product of Pairs is: "+min);
		System.out.println("minimum pairs which is given minimum Product is: "+ar[index1]+" "+ar[index2]);
	}

}
