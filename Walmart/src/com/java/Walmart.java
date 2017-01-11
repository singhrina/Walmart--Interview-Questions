package com.java;

import java.util.Scanner;

public class Walmart {
	public static String walmartReverse() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string :");
		String str = sc.nextLine();
		sc.close();

		// String str = "WALMART";
		String first = "";
		String middle = "";
		String last = "";
		String result = "";

		int mid = str.length() / 2;

		for (int i = (mid - 1); i >= 0; i--) {

			first = first + str.charAt(i);
		}
		middle = middle + str.charAt(mid);

		for (int i = str.length() - 1; i > mid; i--) {

			last = last + str.charAt(i);
		}

		if (str.length() / 2 == 0) {
			result = first + last;
		} else {
			result = first + middle + last;
		}
		System.out.println(result);
		return result;

	}

	public static void main(String[] args) {
		Walmart.walmartReverse();
	}
}
