package com.kodnest.training.pattern.assignments;

public class PalindromeHalfPyramidAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			ch--;
			for(int k=i-1;k>=1;k--) {
				ch--;
				System.out.print(ch+" ");
			}
			System.out.println();
		}

	}

}
