package com;

import java.util.Scanner;

public class MaximumProductPair {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		maximumProductPair(ar);
	}
	public static void maximumProductPair(int[] ar) {
		int max=Integer.MIN_VALUE;
		int index1=0,index2=0;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]*ar[j])>max) {
					max=ar[i]*ar[j];
					index1=i;
					index2=j;
				}
			}
		}
		System.out.println("Maximum Product pairs is:"+max);
		System.out.println("Pair of Maximum Product is: "+ar[index1]+" "+ar[index2]);
	}

}
