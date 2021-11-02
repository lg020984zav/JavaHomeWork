package com.pb.zhitnikov.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void endprogram() {System.out.println("Програма завершена");}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть дві фрази, а я перевірю чи є вони анаграмою. Спробуємо?");
        System.out.println("Введіть першу фразу: ");
        String first = sc.nextLine();
        System.out.println("Введіть другу фразу: ");
        String second = sc.nextLine();
       char[] firstArray = first.toLowerCase().toCharArray();
        boolean sort = false;
        int change;
        while(!sort) {
            sort = true;
            for (int i = 0; i < firstArray.length-1; i++) {
                if(firstArray[i] > firstArray[i+1]){
                    sort = false;
                    change = firstArray[i];
                    firstArray[i] = firstArray[i+1];
                    firstArray[i+1] = (char) change;}}}
        System.out.println(Arrays.toString(firstArray));
       char[] secondArray = second.toLowerCase().toCharArray();
        boolean sort2 = false;
        int change2;
        while(!sort2) {
            sort2 = true;
            for (int i = 0; i < secondArray.length-1; i++) {
                if(secondArray[i] > secondArray[i+1]){
                    sort2 = false;
                    change2 = secondArray[i];
                    secondArray[i] = secondArray[i+1];
                    secondArray[i+1] = (char) change2;}}}
        System.out.println(Arrays.toString(secondArray));
        if(Arrays.equals(firstArray, secondArray))
            System.out.println("Це анаграма");
        else
            System.out.println("Це не анаграма");
        endprogram();
    }


}
