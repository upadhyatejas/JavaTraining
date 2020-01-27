package com.java99;
import java.lang.Math;
import java.util.Scanner;

public class JavaLoopsFunc {
	public void oneToTen() {
		System.out.println("\n***Output***");
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
		System.out.println("\n");
	}
	
	public void oddNumbers() {
		System.out.println("\n***Output***");
		for(int i = 0; i<20; i++) {
			System.out.println(i);
			
		}
		System.out.println("\n");
	}
	
	public void squareNumbers() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\n***Output***");
		for (int i: arr) {
			System.out.println(i*i);
		}
		System.out.println("\n");
	}
	
	@SuppressWarnings("unused")
	public void randomNumbers() {
		System.out.println("\n***Output***");
		int arr[] = {1,2,3,4};
		for(int i: arr) {
			System.out.println((int)(10*Math.random())+1);
		}
		System.out.println("\n");
	}
	
	public void powerofTwo() {
		System.out.println("\n***Output***");
		Scanner myVar = new Scanner(System.in);
		Double powerofTwo = myVar.nextDouble();
		System.out.println(Math.pow(2.0,powerofTwo));
		System.out.println("\n");
		myVar.close();	
		System.out.println("\n");
		
	}
	
	public void areWeThereYet() {
		System.out.println("\n***Output***");
		Scanner myVar = new Scanner(System.in);
		String answer = myVar.nextLine();
		System.out.println("Are we there yet");
		while(answer != "yes") {
			System.out.println("Are we there yet ? \n");	
		}
		myVar.close();
		System.out.println("\n");
		
	}
	
	
	public void triangle() {
		char star = '*';
		System.out.println("\n***Output***");
		System.out.println("enter the number of levels");
		Scanner myVar  = new Scanner(System.in);
		int numberofLevels = myVar.nextInt();
		char arr [] = new char[numberofLevels];
		for(int i  = 1 ; i < numberofLevels;i++) {
			for(int j=0 ; j< i;j++) {
				arr[j] = star;
				
			}
			System.out.println(arr);
		}
		myVar.close();
		
	}
	
	void tableSquare() {
		System.out.println("\n***Output***");
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=4; j++) {
				System.out.print("|"+ i*j +"\t");
				
			}
			System.out.println("|");
		}
	}
	
	void tableSquares() {
		System.out.println("\n***Output***");
		System.out.println("Enter the size of table");
		Scanner myVar = new Scanner(System.in);
		int squareDimensions  = myVar.nextInt();
		for(int i = 1; i<=squareDimensions; i++) {
			for(int j = 1; j<=squareDimensions; j++) {
				System.out.print("|"+ i*j +"\t");
				
			}
			System.out.println("|");
		}
		myVar.close();
	}
	

}
