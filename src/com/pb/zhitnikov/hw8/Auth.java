package com.pb.zhitnikov.hw8;
import java.util.regex.*;
//Создать класс Auth, который содержит поля login и password и методы:
//- signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
//Проверяет параметр login, длинна должна быть от 5 до 20 символов.
// Login должен содержать только латинские буквы и цифры.
// Если логин не соответствует требованиям нужно выбросить WrongLoginException.
//Проверяет параметр password, длинна более 5,
// только латинские буквы и цифры и знак подчеркивания.
// Также password и confirmPassword должны совпадать.
// Если password не соответствует требованиям нужно выбросить WrongPasswordException.
//Если проверки все пройдены успешно записать в свои поля значение login и password.
// Так сохраняем пользователя :)
//- signIn (вход на сайт) принимающий login и password.
//Проверяет что login и password соответствуют значениям из полей класса.
//Если нет - выбрасывает исключение WrongLoginException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения
// с двумя конструкторами – один по умолчанию, второй принимает сообщение и передает его
// в конструктор класса Exception.
public class Auth {
    String login, password, confirmPassword;

    public Auth(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;}

    public String getLogin() {return login;}
    public String getPassword() {return password;}
    public String getConfirmPassword() {return confirmPassword;}
    public void signUp (String login, String password, String confirmPassword){
        if login
    }
}