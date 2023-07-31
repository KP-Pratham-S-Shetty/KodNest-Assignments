package com.kodnest.training.pattern.assignments;

public class PalindromePyramidStarAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n;i++) {
			System.out.print("*");
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				System.out.print(i);
			}
			// to print palindrome
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.print("**");
			System.out.println();
		}
	}

}
