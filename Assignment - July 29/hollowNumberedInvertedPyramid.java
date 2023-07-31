package com.kodnest.training.pattern.assignments;

public class hollowNumberedInvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i==5||j==1||i==j) {
				System.out.print(j+" ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
	}

}
