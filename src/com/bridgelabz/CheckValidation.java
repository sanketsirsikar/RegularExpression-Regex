package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidation {
    Scanner sc=new Scanner(System.in);
    void checkFirstName(){
        System.out.println("Enter Name for First Name");
        String firstName=sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}$",firstName)){
            System.out.println("First Name is Valid");
        }else
            System.out.println("First Name is Invalid");
    }

    void checklastName(){
        System.out.println("Enter Name for Last Name");
        String lastName=sc.nextLine();
        if (Pattern.matches("^[a-z]{1}[A-Z]{3,}$",lastName)){
            System.out.println("Last Name is Valid");
        }else
            System.out.println("Last Name is Invalid");
    }
}