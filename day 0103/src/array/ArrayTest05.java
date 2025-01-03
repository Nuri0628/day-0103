package array;

import java.util.Arrays;

public class ArrayTest05 {
	
	public static void main(String[] args) {
		//배열의 기능을 모아놓은 class를 제공
		int[] arr= {45,22,9,5,3,1};
		for(int n:arr) {
			System.out.println(n);
		}
		System.out.println("========");
		
		Arrays.sort(arr);
		for(int n:arr) {
			System.out.println(n);
		}
		
	}

}
