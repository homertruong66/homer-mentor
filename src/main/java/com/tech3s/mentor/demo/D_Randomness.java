package com.tech3s.mentor.demo;

import java.text.SimpleDateFormat;
import java.util.*;

public class D_Randomness {
    
    // Constants
    private static List<Integer> participants = Collections.unmodifiableList(Arrays.asList (
        25, 29, 22, 5, 11, 29, 4, 18, 26, 18, 8, 32, 17, 21,
        24, 36, 46, 54, 20, 27, 5, 33, 13, 14, 65, 62,  63,
        61, 91, 27, 48, 28, 19, 46, 34, 66)
    );

    // Main Program
	public static void main(String[] args) {
        // Find lucky participants
        Random  random  = new Random();
        System.out.println("There are " + participants.size() + " participants !!!");
        System.out.println("Generating 6 random numbers from 1 to 99...");
        //System.out.print("Please enter the number of integers to be randomly generated: ");
        int numberOfIntegers = 6; // scanner.nextInt();
        boolean noLuckyParticipant = true;
        while (noLuckyParticipant){
            for (int i = 1; i <= numberOfIntegers; i++) {
                int luckyNumber = random.nextInt(99);
                System.out.println(formatDate(new Date()) + " - Random number " + i + ": " + luckyNumber);
                if (participants.contains(luckyNumber)) {
                    System.out.println("Congratulate lucky participant(s) with number: " + luckyNumber);
                    noLuckyParticipant = false;
                }
            }
        }
	}
    
    
    // Utilities
    private static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a dd-MM-YYYY");
        return sdf.format(date);
    }

}
