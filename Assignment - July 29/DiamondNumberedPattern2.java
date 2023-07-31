package com.kodnest.training.pattern.assignments;

public class DiamondNumberedPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			System.out.print(" "+i+" ");
			for(int j=2;j<=i;j++) {
				System.out.print("* "+i+" ");
				
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			System.out.print(" "+i+" ");
			for(int j=2;j<=i;j++) {
				System.out.print("* "+i+" ");
			}
			System.out.println();
		}

	}

}
