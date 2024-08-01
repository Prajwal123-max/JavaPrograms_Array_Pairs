package com;

import java.util.Scanner;

public class PairsWithSecondValueIsSmallerThanFirst {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		pairsWithSecondValueSmaller(ar);
	}
	public static void pairsWithSecondValueSmaller(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
