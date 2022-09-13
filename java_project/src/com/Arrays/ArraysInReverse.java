package com.Arrays;

public class ArraysInReverse {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5};
		System.out.println("Actual sequence");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
		System.out.println();
		System.out.println("Reverse of array");
		for (int i = arr.length - 1; 1 >= 0; i--) {
			System.out.println(arr[i] + " ");

		}

	}
}