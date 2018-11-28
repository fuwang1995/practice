package object;

import java.util.Arrays;

public class Counter {
	public static void main(String[] args) {
		int[] arr= {123,21432,3423,231,24};
		Counter made=new Counter();
		int max=made.getMaxArray(arr);
		System.out.println("max="+max);
		int min=made.getMinArray(arr);
		System.out.println("min="+min);
	}
	//
	public static int getMaxArray(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	public static int getMinArray(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
}
