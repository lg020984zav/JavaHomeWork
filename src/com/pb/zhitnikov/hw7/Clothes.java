package com.pb.zhitnikov.hw7;
//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет
public abstract  class Clothes {
    protected String size;
    protected int cost;
    protected String color;

    public Clothes(String size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
