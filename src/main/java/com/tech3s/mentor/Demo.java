package com.tech3s.mentor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * homertruong
 */

public class Demo {
    
    public static void main (String[] args) {
        // say hello
//        writeToConsole("Hello World");
//        writeToFile("Hello World in File");

        // solve equation: a*x*x + b*x + c = 0
        // get input of a,b,c
//        float a,b,c;
//        Scanner scanner = new Scanner(System.in);
//        writeToConsole("Please enter a: ");
//        a = scanner.nextFloat();
//        writeToConsole("Please enter b: ");
//        b = scanner.nextFloat();
//        writeToConsole("Please enter c: ");
//        c = scanner.nextFloat();
//
//        // calculate delta
//        double delta = b*b - 4*a*c;
//
//        // check delta value to calculate roots
//        if (delta < 0) {
//            writeToConsole("No root");
//            writeToFile("No root");
//        }
//        else {
//            double root1 = (-b + Math.sqrt(delta))/(2*a);
//            writeToConsole("root 1: " + formatRoot(root1));
//            writeToFile("root 1: " + formatRoot(root1));
//
//            double root2 = (-b - Math.sqrt(delta))/(2*a);
//            writeToConsole("root 2: " + formatRoot(root2));
//            writeToFile("root 2: " + formatRoot(root2));
//        }
        
        //demoCoreProgrammingTerms1();
        //demoCoreProgrammingTerms2();
    }
    
//    private static void demoCoreProgrammingTerms1() {
//
//    }
    
//    private static void demoCoreProgrammingTerms2() {
//
//    }
    
    private static void writeToConsole(Object text) {
        System.out.println(text);
    }
    
    private static void writeToFile(Object text) {
        File file         = new File("roots.txt");
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(String.valueOf(text) + "\n");
            bw.flush();
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
            }
            catch (IOException e) {}
        }
    }
    
    private static String formatRoot(double root) {
        if (root == 0) {
            return root + "";
        }
        
        return String.format("%.2f", root);
    }
    
}
