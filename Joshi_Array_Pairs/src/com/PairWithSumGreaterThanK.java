package com;

import java.util.Scanner;

public class PairWithSumGreaterThanK {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the K value : ");
		int k=s.nextInt();
		
		pairsWithGreaterThanKvalue(ar, k);
	}
	public static void pairsWithGreaterThanKvalue(int[] ar,int k) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]+ar[j])>k) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
