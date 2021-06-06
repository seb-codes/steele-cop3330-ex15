/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */

package org.example;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the password? ");
        String password = scan.nextLine();

        String stored_pass = "abc$123";

        if(password.equals(stored_pass)){
            System.out.println("Welcome!");
        }
        else
            System.out.println("I don't know you.");
    }
}
