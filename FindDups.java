package week1.day2;

import java.util.Arrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int[] arr = {3,5,7,9,1,2,2};
			
		for(int i=0;i<arr.length-1;i++)
		{
						
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
			}
			
			
			}
		}
	}
	


