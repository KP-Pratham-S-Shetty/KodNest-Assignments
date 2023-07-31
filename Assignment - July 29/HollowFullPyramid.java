package com.kodnest.training.pattern.assignments;

public class HollowFullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i==5||j==1||j==i) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
			System.out.println();
		}

	}

}
