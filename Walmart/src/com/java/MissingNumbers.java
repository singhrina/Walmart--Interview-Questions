package com.java;

import java.util.ArrayList;

public class MissingNumbers {
	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 5, 6, 7, 10 };
		int j = a[0];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		{
			for (int i = 0; i < a.length; i++) {
				if (j == a[i]) {
					j++;
					continue;
				} else {
					arr.add(j);
					i--;
					j++;
				}
			}
			System.out.println("missing numbers are ");
			for (int r : arr) {
				System.out.println(" " + r);
			}

		}
	}
}
