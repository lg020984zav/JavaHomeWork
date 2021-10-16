package com.pb.zhitnikov.hw2;

import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int resault = 0;
        System.out.println("Введіть ціле число для перевірки попадання в заданий інтервал");
        operand1 = in.nextInt();
        if (operand1 <= 100 & operand1 >= 51) {
            System.out.println("Ваше число попадає в інтервал [51 - 100]");
        }
        else if (operand1 <= 50 & operand1 >= 36) {
            System.out.println("Ваше число попадає в інтервал [36 - 50]");
        }
        else if (operand1 <= 35 & operand1 >= 15) {
            System.out.println("Ваше число попадає в інтервал [15 - 35]");
        }
        else if (operand1 <= 14 & operand1 >= 0) {
            System.out.println("Ваше число попадає в інтервал [0 - 14]");
        }
        else System.out.println("Ваше число не попадає в жоден з вказаних інтервалів");
}}
