package com.in28minutes.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter 1st Number: ");
		int a= scan.nextInt();
		System.out.print("Please Enter 2st Number: ");
		int b = scan.nextInt();
		System.out.println("Plase Select the option: ");
		System.out.println("1: Addition ");
		System.out.println("2: Subtract ");
		System.out.println("3: Multiplication");
		System.out.println("4: Divide ");
		int choice  = scan.nextInt();
		while(choice>=1 && choice<=4) {
			
			switch(choice) {
			case 1: System.out.println("add: " + (a+b));
			break;
			case 2: System.out.println("subtract: " + (a-b));
			break;
			case 3: System.out.println("multiplication: " + (a*b));
			break;
			case 4: System.out.println("Devide: " + (a/b));
			}
			
			System.out.println("Plase Select the option: ");
			System.out.println("1: Addition ");
			System.out.println("2: Subtract ");
			System.out.println("3: Multiplication");
			System.out.println("4: Divide ");
			choice  = scan.nextInt();
		
		}
		
//		switch(choice) {
//		case 1: System.out.println("add" + (a+b));
//		case 2: System.out.println("subtract" + (a-b));
//		case 3: System.out.println("multiplication" + (a*b));
//		case 4: System.out.println("Devide" + (a/b));
//		}

	}

}
