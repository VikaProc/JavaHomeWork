package com.pb.protsenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your number");
        number = scan.nextInt();

        if (number >=0 && number <= 14)
        {
            System.out.println("A number  between 0 and 14");
        } else if (number >=15 && number <= 35)
        {
            System.out.println("A number  between 15 and 35");
        }else if (number >=36 && number <= 50)
        {
            System.out.println("A number  between 36 and 50");
        }else if (number >=51 && number <= 100)
        {
            System.out.println("A number  between 51 and 100");
        } else
            System.out.println("Unknown interval");
    }
}
