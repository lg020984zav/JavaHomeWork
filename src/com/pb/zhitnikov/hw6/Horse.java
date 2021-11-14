package com.pb.zhitnikov.hw6;
import java.util.Objects;
public class Horse extends Animal {
    private int speed;
    public Horse(String name, int speed) {super(name);this.speed = speed;}
    @Override
    public void makeNoise() {System.out.println("І-го-го");}
    @Override
    public void eat() {System.out.println(name+" їсть "+food);}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return speed == horse.speed;}
    @Override
    public int hashCode() {return Objects.hash(super.hashCode(), speed);}
    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';}}