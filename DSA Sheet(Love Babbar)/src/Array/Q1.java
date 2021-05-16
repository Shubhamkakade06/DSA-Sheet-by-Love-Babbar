package Array;

import java.util.Scanner;

//Reverse the Array
public class Q1 {

	public static void main(String[] args) {
		
		int arr[]= {10,2,5,3,6,85,61,85};
		
		int start,end;
		start=0;
		end=arr.length-1;
		
		while(start<end)
		{
			int temp;
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
