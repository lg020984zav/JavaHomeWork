package com.pb.zhitnikov.hw7;
//WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
//Эти методы не принимают параметров, выводят информацию о одежде (название, размер, цену, цвет).
public interface WomenClothes {
    default void dressWomen(){
        System.out.println("Жінка вдягнула " + Clothes());
    }
}
