package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondOccerenceOfCharecter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String : ");
		String string = sc.nextLine();
		sc.close();
		printSecondCharacter(string);
	}

	public static void printSecondCharacter(String string) {
		Map<Character, Integer> map = new HashMap<>();

		boolean firstCharacter = false;            /*to find and eliminate the first
										            repeated character*/
		char[] charArr = string.toCharArray();     // to create an array

		for (int i = 0; i < charArr.length; i++)   /*to go through the characters
												   in string*/

		{
			if (!map.containsKey(charArr[i]))       /*if the map doesn't contain the
												     character*/
			{
				map.put(charArr[i], 1);              // then add it to the map
			} else {
				if (!firstCharacter) {
					firstCharacter = true;          /*when found the first repeated
											         character,condition become true*/				
					} else {
					System.out.println("second repeated character is : " + charArr[i]);
					break;
				}
			}

		}
	}

}
