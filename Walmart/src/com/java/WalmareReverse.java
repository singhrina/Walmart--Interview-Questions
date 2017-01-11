package com.java;

public class WalmareReverse {

	public static String revStr(String s) {

		String result1 = ""; // 0123456

		String result2 = ""; // walmart

		String result3 = "";

		int mid = s.length() / 2; // mid=3;

		for (int i = (mid - 1); i >= 0; i--) {

			result1 = result1 + s.charAt(i);// law

		}

		result2 = result2 + s.charAt(mid);

		// mid = mid+1;

		for (int i = s.length() - 1; i > mid; i--) {

			result3 = result3 + s.charAt(i);

		}

		String result = result1 + result2 + result3;

		System.out.println(result);

		return result;

	}

	public static void main(String[] args) {

		WalmareReverse.revStr("WALMART");

	}

}
