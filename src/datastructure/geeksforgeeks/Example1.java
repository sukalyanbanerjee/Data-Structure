package datastructure.geeksforgeeks;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		int numberOfTestCases, arySize, elementToBeSearched;
		int ary[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		numberOfTestCases = sc.nextInt();
		
		while (numberOfTestCases > 0) {
			arySize = sc.nextInt();
			
			for (int i = 0; i < arySize; i++) {
				ary[i] = sc.nextInt();
			}
			
			elementToBeSearched = sc.nextInt();
			System.out.println("Element pos : " + linearSearch(ary, elementToBeSearched));
			
			numberOfTestCases--;
		}
	}
	
	private static int linearSearch(int ary[], int elementToBeSearched) {
		
		for (int i = 0; i < ary.length; i++) {
			if (elementToBeSearched == ary[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
