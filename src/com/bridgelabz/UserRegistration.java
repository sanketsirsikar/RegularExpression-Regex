package com.bridgelabz;

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration System needs to ensure all validations are in place during the User Entry");

        CheckValidation valid = new CheckValidation();
        valid.checkFirstName();
        valid.checklastName();
    }
}