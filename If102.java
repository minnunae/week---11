package it.com;

import java.util.Scanner;
public class If102 {
	
	public static void main(String[]args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = read.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("EVENT");
		}
		else {
			System.out.println("ODD");
		}
	System.out.println("End-Loop");
	}

}
