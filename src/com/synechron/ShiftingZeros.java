package com.synechron;

import java.util.Arrays;

public class ShiftingZeros {

//	public int[] shiftAllZerosAtEnd(int arr[]) {
//
//		int n = 1;
//		int size = arr.length - n;
//		for (int i = 0; i < size;) {
//			int tis = arr[i];
//			int next = arr[i + n];
//			if (tis == 0) {
//				if (next == 0) {
//					n++;
//				} else {
//					arr[i] = next;
//					arr[i + n] = 0;
//					i++;
//				}
//			} else {
//				i++;
//			}
//			size = arr.length - n;
//		}
//		return arr;
//	}

	public int[] shiftAllZerosAtEnd(int arr[]) {
		int previous = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && previous == -1) {
				previous = i;
			}
			if (previous > -1 && arr[i] != 0) {
				int temp = arr[previous];
				arr[previous] = arr[i];
				arr[i] = temp;
				i = previous - 1;
				previous = -1;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ShiftingZeros shiftingZeros = new ShiftingZeros();

		int[] shiftAllZerosAtEnd = shiftingZeros.shiftAllZerosAtEnd(new int[] { 6, 0, 0, -3, 0, 5, 0, 4 });
		System.out.println("==============Shifting zeros at end================");
		System.out.println(Arrays.toString(shiftAllZerosAtEnd));

	}

}
