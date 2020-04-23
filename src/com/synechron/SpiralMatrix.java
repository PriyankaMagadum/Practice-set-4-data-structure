package com.synechron;

public class SpiralMatrix {

	public void printSpiralMatrix(int arr[][], int n) {
		System.out.println("==========Sprital Elements of Matrix================");
		int count = 0;
		int s1 = 0, s2 = 0, e1 = n, e2 = 0;
		while (count != n * n) {

			for (int i = s2; i < e1; i++) {
				System.out.print(arr[s1][i] + ",");
				s2++;
				count++;
			}
			s1++;
			s2--;
			for (int j = s1; j < e1; j++) {
				System.out.print(arr[j][s2] + ",");
				s1++;
				count++;
			}

			s1 = s1 - 1;
			s2 = s2 - 1;
			for (int k = s2; k >= e2; k--) {
				System.out.print(arr[s1][k] + ",");
				s2--;
				count++;
			}
			s1--;
			s2++;
			for (int l = s1; l > e2; l--) {
				System.out.print(arr[l][s2] + ",");
				s1--;
				count++;
			}

			s1 = s1 + 1;
			s2 = s2 + 1;
			e1 = e1 - 1;
			e2 = e2 + 1;

		}

	}

	public static void main(String[] args) {
		SpiralMatrix spiralMatrix = new SpiralMatrix();

		int arr[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		spiralMatrix.printSpiralMatrix(arr, 4);

	}

}
