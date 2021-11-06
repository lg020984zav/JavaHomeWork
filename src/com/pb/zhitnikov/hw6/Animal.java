package com.pb.zhitnikov.hw6;

public class Animal {
    private String food;
    private String location;
    private String animal;

    public Animal() {}

    public String getFood() {return food;}
    public void setFood(String food) {this.food = food;}
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}
    public String getAnimal() {return animal;}
    public void setAnimal(String animal) {this.animal = animal;}

    public void makeNoise (){System.out.println(animal+" шумить");}
    public void eat (){System.out.println(animal+" їсть");}
    public void sleep (){System.out.println(animal+" спить");}
}
