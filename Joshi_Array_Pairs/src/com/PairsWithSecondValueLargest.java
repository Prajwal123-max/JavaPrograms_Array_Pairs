package com;

import java.util.Scanner;

public class PairsWithSecondValueLargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		pairsWithSecondValueLargest(ar);
	}
	public static void pairsWithSecondValueLargest(int[] ar) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
