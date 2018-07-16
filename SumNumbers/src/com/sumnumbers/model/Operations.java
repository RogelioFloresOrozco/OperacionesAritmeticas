package com.sumnumbers.model;

import java.util.Random;

public class Operations {
	
	public int sumNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	public int restNumbers(int num1, int num2) {
		return num1-num2;
	}
	
	public int multNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	public double divNumbers(int num1, int num2) {
		return num1/num2;
	}
	
	public double sqrNumbers(int num1) {
		return Math.sqrt(num1);
	}
	
	public int powNumbers(int num1, int num2) {
		
		int pow = num1;
		for(int i=0 ; i<num2-1 ; i++)
			pow=pow*num1;
		
		return pow;
	}
	
	public static int factNumbers(int num1) {
		
		int result=1;
		
		for(int i=num1; i>0 ; i--)
			result=result*i;
		
		return result;
	}
	
	public static int[] Random(int rank) {
		int arr[] = new int[rank];
		
		Random rand = new Random(System.nanoTime());
		
		for(int i=0 ; i<rank ; i++) {
			arr[i] = rand.nextInt(100)+1;
		}
		
		return arr;
	}
	
}
