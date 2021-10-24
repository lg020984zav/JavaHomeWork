package com.pb.zhitnikov.hw3;
import java.util.Scanner;
import java.util.Random;
public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101);
        int y;
        int counter = 0;
        int maxcounter = 100;
        Scanner in = new Scanner(System.in);
        System.out.println(x);
        System.out.println("Вгадайте яке число я загадав від 0 до 100?");
        System.out.println("Якщо схочете завершити вгадування достроково просто введіть число більше 100");
        System.out.println("Введіть ціле число від 0 до 100");
        while ( counter < maxcounter){
            counter++;
            y = in.nextInt();
            if (y>100){System.out.println("До побачення!");break;}
            if (x < y) {System.out.println("Введіть інше ціле число від 0 до 100 менше " + y);}
            if (x > y) {System.out.println("Введіть інше ціле число від 0 до 100 більше " + y);}
            if (x==y) {System.out.println("Ви вгадали з " + counter + "спроби");break;}}}}