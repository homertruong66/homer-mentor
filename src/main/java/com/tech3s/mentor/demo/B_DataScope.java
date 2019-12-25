package com.tech3s.mentor.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * homertruong
 */

public class B_DataScope {
    
    // Main Program
    public static void main (String[] args) {
        int x = 6;
        System.out.println("x in main: " + x);
        proc1(x);
        x = proc2(x);
        System.out.println("x in main after calling proc1, proc2: " + x);
    }
    
    
    // Procedures and Functions
    
    // Demo Programming Terms 1
    private static void demoProgrammingTerms1() {
        // say hello
        Date now = new Date();
        writeToConsole("Hello World at " + formatDate(now));
        writeToFile("Hello World in File at " + formatDate(now));
    
        // solve equation: a*x*x + b*x + c = 0
        // get input of a,b,c
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        writeToConsole("Please enter a: ");
        a = scanner.nextFloat();
        writeToConsole("Please enter b: ");
        b = scanner.nextFloat();
        writeToConsole("Please enter c: ");
        c = scanner.nextFloat();
    
        // calculate delta
        double delta = b*b - 4*a*c;
    
        // check delta value to calculate roots
        if (delta < 0) {
            writeToConsole("No root");
            writeToFile("No root");
        }
        else {
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            writeToConsole("root 1: " + formatRoot(root1));
            writeToFile("root 1: " + formatRoot(root1));
        
            double root2 = (-b - Math.sqrt(delta))/(2*a);
            writeToConsole("root 2: " + formatRoot(root2));
            writeToFile("root 2: " + formatRoot(root2));
        }
    }
    
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
    
    private static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a dd-MM-YYYY");
        return sdf.format(date);
    }
    
    private static String formatRoot(double root) {
        if (root == 0) {
            return root + "";
        }
        
        return String.format("%.2f", root);
    }
    
    
    // Demo Programming Terms 2
    private static void proc1(int x) {
        x++;
        x = proc2(x);
        System.out.println("x in proc1: " + x);
    }
    
    private static int proc2(int x) {
        x -= 3;
        System.out.println("x in proc2: " + x);
        
        return x;
    }
}
