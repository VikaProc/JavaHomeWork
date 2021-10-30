package com.pb.protsenko.hw4;

import java.util.Scanner;

/*Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
Строку должен ввести пользователь.
Пример работы:
Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
При выполнении задания использовать метод(ы).*/
public class CapitalLetter {

    static void print(String str)
    {
        String[] strParts = str.split(" ");
        for(int i = 0; i < strParts.length; i++) {
            System.out.println(strParts[i].substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" input string ");

        String str = scan.next();
        print(str);

    }
}
