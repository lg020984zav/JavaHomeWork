package com.pb.zhitnikov.hw4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть фразу, а я кожне слово напишу з великої букви. Спробуємо?");
        System.out.println("Введіть фразу: ");
        String start = sc.nextLine();
        String words;
        char symbol;
        String end = "";
        StringTokenizer a = new StringTokenizer(start);
        while (a.hasMoreTokens()) {
            words = a.nextToken();
            symbol = Character.toUpperCase(words.charAt(0));
            end += symbol + words.substring(1)+ " ";}
        System.out.println(end);
    }
}