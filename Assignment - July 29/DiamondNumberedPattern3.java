package com.kodnest.training.pattern.assignments;

public class DiamondNumberedPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				a++;
				System.out.print(a+ " ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a--;
				
			}
			System.out.println();
		}


	}

}
