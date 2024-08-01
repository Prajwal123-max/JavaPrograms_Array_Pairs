/*
 * in pairs both numbers should be odd.
 */
package com;

import java.util.Scanner;

public class OddPairs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		oddPairs(ar);
	}
	public static void oddPairs(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if((ar[i]%2!=0)&&(ar[j]%2!=0)) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}

}
