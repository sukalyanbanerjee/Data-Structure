package datastructure.geeksforgeeks;

import java.util.Scanner;


//Kadane's algorithms
//http://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
public class Example2 {
	
	public static void main(String args[]) {
		int numberOfTestCases, arySize;
		int[] ary = new int[100];
		
		System.out.println("Enter the number of test cases:");
		Scanner sc = new Scanner(System.in);
		numberOfTestCases = sc.nextInt();
		
		while (numberOfTestCases > 0) {
			System.out.println("Enter the arrays size:");
			arySize = sc.nextInt();
			
			System.out.println("Enter " + arySize + " elements.");
			for (int i = 0; i < arySize; i++) {
				ary[i] = sc.nextInt();
			}
			
			System.out.println("Maximum  sum = " + sum(ary));
			numberOfTestCases--;
		}
		sc.close();
	}
	
	private static int sum(int[] ary) {
		int maxSoFar = 0, maxEndingHere = 0;
		
		for(int  i = 0; i < ary.length; i++) {
			maxEndingHere += ary[i];
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
			else if (maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
			}
		}
		
		return maxSoFar;
	}
}
