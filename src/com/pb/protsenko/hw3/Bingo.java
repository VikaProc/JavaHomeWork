package com.pb.protsenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int num;
        int counter = 0;
        Random random = new Random();
        int x = random.nextInt(100);

        String symbol;
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 100");
        System.out.println("For exit press 0");

        System.out.println(x);

        do {
            counter++;
            num = scan.nextInt();


            if (num <= 100 && num >= 0) {

                if (num == 0)
                {
                    break;
                } else if (num < x) {
                    System.out.println("Number less than needed");
                } else if (num > x) {
                    System.out.println("Number more than needed");
                }  else if (num == x) {
                    System.out.println("Сongradulations, you guessed the number on " + counter + " attempts");
                }
            }
            else
            {
                System.out.println("Number out of range");
                break;
            }

        }
        while (num != x);
        System.out.println(" The end of the game ");

    }
}
