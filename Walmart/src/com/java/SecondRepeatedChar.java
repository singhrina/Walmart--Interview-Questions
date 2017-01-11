package com.java;

import java.util.Scanner;

public class SecondRepeatedChar {
	
	
	public static void repeatedChar(String s)
	{
		int count=0;
		for (int i= 0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					if(count==2)
					{
						System.out.println(s.charAt(i));
					}
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String : ");
		String string = sc.nextLine();
		sc.close();
		repeatedChar(string);
		
	}

}
