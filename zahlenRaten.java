package com.company;

import java.util.Scanner;

import java.util.Random;

public class zahlenRaten {

    public static void main(String[] args) {
        int userInput = 0;
        int randomNumber = -1;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        randomNumber = random.nextInt(100);

        while (userInput != randomNumber) {
            System.out.println("Pls enter a number between 1 - 100");
            userInput = scanner.nextInt();

            if (userInput > randomNumber) {
                System.out.println("The chosen number is too high!!!");
            }
            else if (userInput < randomNumber) {
                System.out.println("The chosen number is too low!!!");
            } else {
                System.out.println("U got it!!!");
            }
        }
    }
}
