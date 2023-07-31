package com.kodnest.training.pattern.assignments;

public class DiamondNumberedPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int m=3;
		for(int i=m;i<=n;i++) {
			for(int j=m;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=m;i--) {
			for(int j=m;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}

	}

}
