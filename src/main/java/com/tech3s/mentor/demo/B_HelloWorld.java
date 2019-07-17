package com.tech3s.mentor.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B_HelloWorld {

	// Main Program
	public static void main(String[] args) {
		System.out.print("Please enter your name: ");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Date now = new Date();
		
		System.out.println("Welcome '" + name + "' to Java World at '" + formatDate(now) + "' !");
		scanner.close();
	}

	
	// Utilities
	private static String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a dd-MM-YYYY");
		return sdf.format(date);
	}

}
