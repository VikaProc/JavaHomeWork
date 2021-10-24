package com.pb.protsenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
           /* Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых
            чисел размерностью 10 элементов.
Вывести на экран введенный массив.
Подсчитать сумму всех элементов массива и вывести ее на экран.
Подсчитать и вывести на экран количество положительных элементов.
Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
(https://en.wikipedia.org/wiki/Bubble_sort)
Вывести на экран отсортированный массив.*/
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input array  lenght 10: ");

        System.out.println(array.length);
//Fill array
        for(int i=0; i< array.length; i++)
        {
            array[i] = scanner.nextInt();
        }
//Show array
        for(int anArray : array)
        {
            System.out.print(anArray + " ");
        }
        System.out.println();
//Sum
        int sum = 0;
        for(int i=0; i< array.length; i++)
        {
            sum+=array[i];
        }
        System.out.print(" Sum = " + sum);
        System.out.println();
//Sum of positive elements
        int sumPos = 0;
        for(int i=0; i< array.length; i++)
        {
            if (array[i] >0 ) {
                sumPos += array[i];
            }
        }
        System.out.print(" Sum of positive elements = " + sumPos);
        System.out.println();
 // Sort
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }

        for(int anArray : array)
        {
            System.out.print(anArray + " ");
        }
    }

}
