package com.pb.zhitnikov.hw8;
import java.util.Scanner;
//Создать класс OnlineShop с методом main.
//В main создать один объект класса Auth.
//Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
//Обработать исключения методов signUp signIn с помощью блоков try-catch.
public class OnlineShop {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@ssw0rd";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите login: ");
      String usersLogin = in.next();
        if (login.equals(usersLogin)) {
            System.out.print("Введите password: ");
            String usersPassword = in.next();
            if (password.equals(usersPassword)) {
                System.out.println("Здравствуйте " + usersLogin + ", Вы вошли в систему.");
            } else {
                System.out.println("Вы ввели неверный пароль!");
            }
        } else {
            System.out.println("Нет пользователя с таким именем!");
        }
    }
}
