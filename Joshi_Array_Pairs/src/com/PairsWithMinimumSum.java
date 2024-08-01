/*
 * print pairs of numbers form the input array whose sum is minimum.
 */
package com;

import java.util.Scanner;

public class PairsWithMinimumSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		pairsWithMinimumSum(ar);
	}
	public static void pairsWithMinimumSum(int[] ar) {
		int min=Integer.MAX_VALUE;
		int index1=0,index2=0;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]+ar[j])<min) {
					min=ar[i]+ar[j];
					index1=i;
					index2=j;
				}
			}
		}
		System.out.println(ar[index1]+" "+ar[index2]);
	}

	
	/*
	 * Another way of this code.
	 * 
	 * public static void pairsWithMinimumSum(int[] ar) {
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<min) {
				secondMin=min;
				min=ar[i];
			}
			else if(ar[i]<secondMin && ar[i]!=min) {
				secondMin=ar[i];
			}
		}
		
		System.out.println(min+" "+secondMin);
	}
	 */
}
