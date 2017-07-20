package datastructure.geeksforgeeks;

import java.util.Scanner;

//http://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
public class Example3 {

	public static void main(String[] args) {
		
		int numberOfTestCases, arySize, expectedSum;
		int[] ary = new int[100];
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the number of test cases...");
		
		numberOfTestCases = scanner.nextInt();
		
		while(numberOfTestCases > 0) {
			System.out.println("Enter the size of the array & the expected sum..");
			arySize = scanner.nextInt();
			expectedSum = scanner.nextInt();
			
			System.out.println("Enter " + arySize + " elements..");
			for (int i = 0; i < arySize; i++) {
				ary[i] = scanner.nextInt();
			}
			
			//findPosition(ary, expectedSum);
			findPositionSolution2(ary, expectedSum);
			numberOfTestCases--;
		}
	}
	
	private static void findPosition(int[] ary, int expectedSum) {
		int sumSoFar = 0, startPos = 0, endPos = 0;
		boolean foundFlag = false;
		
		for (int i = 0; i < ary.length; i++) {
			startPos = i + 1;
			sumSoFar = ary[i];
			for (int j = i+1; j < ary.length; j++) {
				if (sumSoFar == expectedSum) {
					endPos = j;
					foundFlag = true;
					break;
				}
				sumSoFar += ary[j];
			}
			if (foundFlag) {
				System.out.println("Start position : " + startPos + ", End position : " + endPos);
				break;
			}
		}
	}
	
	private static void findPositionSolution2(int[] ary, int expectedSum) {
		int sumSoFar = ary[0], startPos = 0, endPos = 0;
		boolean foundFlag = false;
		
		for (int i = 1; i < ary.length; i++) {
			while (sumSoFar > expectedSum) {
				sumSoFar -= ary[startPos];
				startPos++;
			}
			if (sumSoFar == expectedSum) {
				System.out.println("Start position : " + (startPos + 1) + ", End position : " + (endPos + 1));
				break;
			}
			sumSoFar += ary[i];
			endPos++;
		}
	}

}
