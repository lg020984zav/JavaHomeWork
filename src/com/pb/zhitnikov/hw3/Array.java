package com.pb.zhitnikov.hw3;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] array = new int [10];
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count =0;
        System.out.println("Введіть елементи масиву. Масив має 10 елементів");
        for (int i = 0; i< array.length; i++){array [i] = in.nextInt();}
        System.out.print("Ваш масив: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {sum += array[i];}
        System.out.println("Сума елементів масиву: " + sum);
        for (int i = 0; i < array.length; i++){if (array[i]>0) count++;};
        System.out.println("Кількість додатних елементів масиву: " + count);
        System.out.println("Тепер відсортуємо масив за зростанням");
        boolean sort = false;
        int change;
        while(!sort) {
            sort = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    sort = false;
                    change = array[i];
                    array[i] = array[i+1];
                    array[i+1] = change;}}}
        System.out.println(Arrays.toString(array));}}