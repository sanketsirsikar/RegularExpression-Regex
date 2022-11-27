package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidation {
    void checkFirstName(){
        System.out.println("Enter First Name");
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}$",firstName)){
            System.out.println("First Name is Valid");
        }else
            System.out.println("First Name is Invalid");

    }
}
