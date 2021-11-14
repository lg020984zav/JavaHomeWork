package com.pb.zhitnikov.hw6;
public class Veterinarian {
    private String name;
    public Veterinarian(String name) {this.name = name;}
    public void treatAnimal(Animal animal){
        System.out.println("Ветеринар "+name+" лікує "+animal.getName()+" в "+animal.getLocation()
        +" яке їсть "+animal.getFood());}}