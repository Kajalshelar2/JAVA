package com.operator;

import java.util.Scanner;

public class AgeCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age =12;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		if(age>0 && age<6) {
			System.out.println("Nursery");
		}
		else if(age>=6 && age<11) {
			System.out.println("z.p students");
		}
		else if(age>=11 && age<18) {
			System.out.println("High school students");
		}
		else if(age>18 && age<23) { 
			System.out.println("College students");
		}
		else if(age>23 && age<60) {
			System.out.println("Employement");
		}
		else if (age >60){
			System.out.println("Senior Citizens");	
		}
		else {
System.out.println("Invalid age");
	}
	}
}
