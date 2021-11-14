package com.pb.zhitnikov.hw7;
//создать перечисление (enum) Size со значениями XXS, XS, S, M, L.
// Перечисление содержит метод getDescription()
// возвращающий строку для XXS "Детский размер", для остальных "Взрослый размер"
// перечисление должно иметь метод getEuroSize()
// возвращающий числовое значение (32, 34, 36, 38, 40) соответствующее каждому размеру
// Создать конструктор принимающий на вход description и euroSize.
public enum Size {
    XXS,
    XS,
    S,
    M,
    L;
    String description;
    int eurosize;

    Size(String description, int eurosize) {
        this.description = description;
        this.eurosize = eurosize;
    }

    public String getDescription(){
        if (this == Size.XXS) {
            return description="Дитячий розмір";
            else return description="Дорослий розмір";}
        }
public void getEurosize () {
    if (this == Size.XXS) return eurosize = 32;
    if (this == Size.XS) return eurosize = 34;
    if (this == Size.S) return eurosize = 36;
    if (this == Size.M) return eurosize = 38;
    if (this == Size.L) return eurosize = 40;
}
}