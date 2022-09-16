/*
 * Huu Hung Nguyen
 * 09/16/2022
 * Assignment 3
 * Write a recursive method that displays a string in reverse order.
 * The program has the method call a helper method 
 * that includes the string's high index.
 */

import java.util.Scanner;

public class Program1 {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for a string
        System.out.print("Enter your string: ");
        String value = input.nextLine();
        
        // Display reversed string
        reverseDisplay(value);
    }
    
    /** Method for displaying a string in reverse order */
    public static void reverseDisplay(String value) {
        reverseDisplay(value, value.length());
    }
    
    /** Helper method including the string's high index */
    public static void reverseDisplay(String value, int high) {
        if (high > 0) {
            System.out.print(value.charAt(high - 1));
            reverseDisplay(value.substring(0, high - 1));
        }
    }
}
