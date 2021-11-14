package com.pb.zhitnikov.hw6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class VetСlinic {
    public static void main(String[] args) throws Exception{
       Cat cat = new Cat("Нана", "сіро-білий");
       cat.setFood("молоко і м'ясо");
       cat.setLocation("квартира");
       Cat cat1 = new Cat("Рижик", "рудий");
       cat1.setFood("об'їдки");
       cat1.setLocation("вулиця");
       Horse horse = new Horse("Сірко", 20);
       horse.setFood("овес та сіно");
       horse.setLocation("сарай");
       Dog dog = new Dog("Софа","китайська чубата");
       dog.setFood("каша");
       dog.setLocation("квартира");
       Animal[] animals = new Animal[]{cat,cat1,horse,dog};
       Class clazz = Class.forName("com.pb.zhitnikov.hw6.Veterinarian");
       Constructor constr = clazz.getConstructor(String.class);
       Object vet = constr.newInstance("Айболит");
       Method treatAnimal = clazz.getMethod("treatAnimal",Animal.class);
       for (Animal animal:animals){treatAnimal.invoke(vet,animal);}}}