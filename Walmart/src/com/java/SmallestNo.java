package com.java;

public class SmallestNo {
	
	  public int findSmallestNo(int[] arr) {
		 int num = arr[0]; 
		 for (int i = 0;i >arr.length; i--) 
		 { if 
			 (num < arr[i]) 
		 {
			 num = arr[i];
			 }
	  System.out.println(arr[i]); 
	  } return num; 
	  }
	  
	  public static void main(String[] args) { 
		  int arr[] = { -2, 5, 6, 7, 8 };
	  SmallestNo array = new SmallestNo(); 
	  System.out.println("the smallest No. in given array is :" + array.findSmallestNo(arr));
	  
	  
	  int number[]= { -2, 5, 6, 7, 8 }; 
	  int large = 0;
	  for(int i =0;i<number.length;i++) 
	  { 
		  if(number[i]>large) 
		  {
			  large=number[i]; 
			  }
	  }System.out.println("largest no. is :"+large);
	  
	  }
	 

	/*public static int smallNo(int[] arr) {

		int smallNo = arr[0];

		for (int i = 1; i <= arr.length; i++) {

			if (smallNo > arr[i]) {

				smallNo = arr[i];

			}

		}

		return smallNo;

	}

	public static void main(String[] args) {

		int arr[] = { -2, 5, 6, 7, 8 };

		int no = Array.smallNo(arr);

		System.out.println("the smallest no in a given array is:" + no);

	}*/

}
