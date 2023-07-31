package com.kodnest.training.pattern.assignments;

import java.util.Scanner;

public class SolidRectangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Length of Square: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}// TODO Auto-generated method stub
		sc.close();
	}

}
