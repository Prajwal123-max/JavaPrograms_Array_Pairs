package com;

import java.util.Scanner;

public class PairsWIthDifferenceK {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the k value:");
		int k=s.nextInt();
		
		pairsWithDifferenceKvalue(ar, k);
	}
	public static void pairsWithDifferenceKvalue(int[] ar,int k) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]-ar[j])==k || (ar[j]-ar[i])==k) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
