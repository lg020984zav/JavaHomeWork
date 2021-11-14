package com.pb.zhitnikov.hw7;
//ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
//Эти методы не принимают параметров, выводят информацию о одежде (название, размер, цену, цвет).
public interface ManClothes {
    default void dressMan(){
        System.out.println("Чоловік вдягнув " + Clothes());
    }
}
