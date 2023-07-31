package com.kodnest.training.pattern.assignments;

public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--){
				if(i==1||j==5||i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
