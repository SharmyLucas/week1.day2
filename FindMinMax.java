package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {22,3981,-19,82,0,45,37};
		Arrays.sort(num);
		
		int size=num.length;
		int minVal=num[0];
		int maxVal=num[size-1];
		
		System.out.println("Minimum Value" + minVal);
		System.out.println("Maximum Value" + maxVal);
		
		

	}

}
