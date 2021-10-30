package com.pb.protsenko.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static char[] sort(String str){
        char[] arrstr = str.replaceAll("[.,]", "").toLowerCase().toCharArray();

        Arrays.sort(arrstr);
        return arrstr;
    }

    static void check(String str1, String str2)
    {
        System.out.println(Arrays.equals(sort(str1), sort(str2))? "yes" : "no");
    }

    public static void main(String[] args) {
        /*Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.
Пример анаграмм:
Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
Я в мире — сирота. -> Я в Риме — Ариост.
При выполнении задания использовать метод(ы).
         */
        Scanner scan = new Scanner(System.in);

        System.out.println(" input first string ");
        String str1 = scan.next();
        System.out.println(str1);

        System.out.println(" input second string ");
        String str2 = scan.next();
        System.out.println(str2);

        check(str1, str2);
    }
}
