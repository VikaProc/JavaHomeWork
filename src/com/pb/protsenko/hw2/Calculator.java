package com.pb.protsenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        double res;
        String s;

        System.out.println("Input x");
        x = scan.nextInt();
        System.out.println("Input y");
        y = scan.nextInt();
        System.out.println("Input operation");
        s = scan.next();

        switch(s)
        {
            case "+" :
                res = x + y;
                System.out.println ((x) + ("+") + (y) + "="+ (res));
                break;
            case "-" :
                res = x - y;
                System.out.println ((x) + ("-") + (y) +"=" + (res));
                break;
            case "*" :
                res = x * y;
                System.out.println ((x)+("*") + (y) + "=" +(res));
                break;
            case "/" :
                if (y == 0)
                {
                    System.out.println("Division by zero");
                    break;
                }
                else {
                    res = x / y;
                    System.out.println ((x) +("/") + (y) + "=" +(res));
                    break;
                }
            default: System.out.println("Incorrect input");
        }
    }
}
