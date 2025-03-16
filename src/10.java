package com.math;
public class MathHomework {
	public static int findLargest(int a, int b, int c) {
		return (a > b && a > c) ? a : (b > c ? b : c);
	}
	public static void main(String[] args) {
		System.out.println("The largest number is " + findLargest(1, 2, 3));
	}
}