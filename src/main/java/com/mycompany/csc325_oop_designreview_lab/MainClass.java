/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author Jessalyn Otero
 */
public class MainClass {

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	 // Input for Student
	 System.out.print("Enter name for Student: ");
	 String studentName = scanner.nextLine();

	 System.out.print("Enter age for Student: ");
	 short studentAge = scanner.nextShort();

	 System.out.print("Enter GPA for Student: ");
	 double studentGPA = scanner.nextDouble();

	 scanner.nextLine();

	 // Input for Freshman
	 System.out.print("Enter name for Freshman: ");
	 String freshmanName = scanner.nextLine();

	 System.out.print("Enter age for Freshman: ");
	 short freshmanAge = scanner.nextShort();

	 System.out.print("Enter credits for Freshman: ");
	 int freshmanCredits = scanner.nextInt();

	 System.out.print("Enter GPA for Freshman: ");
	 double freshmanGPA = scanner.nextDouble();

	 scanner.nextLine();

	 // Input for Senior
	 System.out.print("Enter name for Senior: ");
	 String seniorName = scanner.nextLine();

	 System.out.print("Enter age for Senior: ");
	 short seniorAge = scanner.nextShort();

	 System.out.print("Enter credits for Senior (must be 85 or more): ");
	 int seniorCredits = scanner.nextInt();

	 System.out.print("Enter GPA for Senior: ");
	 double seniorGPA = scanner.nextDouble();


	 //Student, Freshman and Senior instances
	 Student std1= new Student(studentName, studentAge, studentGPA);

	 Freshman std2= new Freshman(freshmanName, freshmanAge, freshmanCredits, freshmanGPA);

	 Senior std3 = new Senior(seniorName, seniorAge, seniorCredits, seniorGPA);

	 System.out.println(std1);
	 System.out.println(std2);
	 System.out.println(std3);

	 scanner.close();
	}
}

