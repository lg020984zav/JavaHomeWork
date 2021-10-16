package com.pb.zhitnikov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int operand2;
        String symbol;
        int resault = 0;

        System.out.println("Введіть ціле число");
        operand1 = in.nextInt();
        System.out.println("Введіть друге ціле число");
        operand2 = in.nextInt();
        System.out.println("Введіть обрану дію +,-,* або /");
        symbol = in.next();
        switch (symbol) {
            case "+":
                resault = operand1 + operand2;
                break;
            case "-":
                resault = operand1 - operand2;
                break;
            case "*":
                resault = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("Ділення на 0 неможливе");}
                else resault = operand1 / operand2;
                break;
            default:
                System.out.println("Некоректна дія. Виберіть коректно дію +,-,* або /");
                return;
        }
        System.out.println("Результат операції: " + resault);
    }
}