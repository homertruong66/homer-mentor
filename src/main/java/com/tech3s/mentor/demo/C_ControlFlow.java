package com.tech3s.mentor.demo;

import java.text.SimpleDateFormat;
import java.util.*;

public class C_ControlFlow {
    
    // Constants
    private static List<Integer> participants = Collections.unmodifiableList(Arrays.asList (
        25, 29, 22, 5, 11, 29, 4, 18, 6, 18, 8, 32, 17, 21,
        24, 36, 46, 54, 20, 27, 5, 33, 13, 14, 65, 62,  63,
        61, 9, 27, 48, 28, 19, 46, 34)
    );

    // Main Program
	public static void main(String[] args) {
		System.out.println("Print star structure...");

        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        do {
        	System.out.print("Please enter n (n>0): ");
        	n = scanner.nextInt();
        }
        while (n <=0);
        
        System.out.println("1. n*n star matrix:");
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= n; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n2. Left star triangle:");
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n3. Inversed Left star triangle:");
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= n-i+1; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }       
        
        System.out.println("\n4. Right star triangle:");
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= n; j ++) {
            	if (j == n - i + 1) {
            		// print stars
            		for (int k = j; k <= n; k++) {
            			System.out.print("* ");
            		}
            	}
            	else {
            		System.out.print("  ");
            	}
            }
            System.out.println();
        }        
        
        System.out.println("\n5. Inversed Right star triangle:");
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= n; j ++) {
            	if (j == i) {
            		// print stars
            		for (int k = j; k <= n; k++) {
            			System.out.print("* ");
            		}
            	}
            	else {
            		System.out.print("  ");
            	}
            }
            System.out.println();
        }   
        
        System.out.println("\n6. Star pyramid:");
        for(int i = 1; i <= n; i ++) {
        	// print spaces
            for(int j = 1; j <= n-i; j ++){
                System.out.print("  ");
            }
            
            // print stars
            for(int k = 1; k <= 2*i-1; k ++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
		
        // Find lucky participants
        Random  random  = new Random();
        System.out.println("There are " + participants.size() + " participants !!!");
        System.out.println("Generating 6 random numbers from 1 to 66...");
        //System.out.print("Please enter the number of integers to be randomly generated: ");
        int numberOfIntegers = 6; // scanner.nextInt();
        boolean noLuckyParticipant = true;
        while (noLuckyParticipant){
            for (int i = 1; i <= numberOfIntegers; i++) {
                int luckyNumber = random.nextInt(66);
                System.out.println(formatDate(new Date()) + " - Random number " + i + ": " + luckyNumber);
                if (participants.contains(luckyNumber)) {
                    System.out.println("Congratulate lucky participant(s) with number: " + luckyNumber);
                    noLuckyParticipant = false;
                }
            }
        }
        
        scanner.close();
	}
    
    
    // Utilities
    private static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a dd-MM-YYYY");
        return sdf.format(date);
    }

}
