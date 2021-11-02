package com.pb.zhitnikov.hw5;

import static com.pb.zhitnikov.hw5.Book.getBookCount;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        book1.setBookName("Пригоди");
        book2.setBookName("Словник");
        book3.setBookName("Енциклопедія");
        book1.setBookAuthor("Іванов І.І.");
        book2.setBookAuthor("Сидоров А.В.");
        book3.setBookAuthor("Гусев К.В.");
        book1.setBookYear(2000);
        book2.setBookYear(1980);
        book3.setBookYear(2010);
        reader1.setName("Петров В.В.");
        reader1.setTiketName(123);
        reader1.setDateBirth(1990-12-01);
        reader1.setFakultetName("Історичний факультет");
        reader1.setPhoneNumber("0661234567");
        reader2.setName("Чумак П.П");
        reader2.setTiketName(234);
        reader2.setDateBirth(1991-01-01);
        reader2.setFakultetName("Економічний факультет");
        reader2.setPhoneNumber("0671234567");
        reader3.setName("Мельник І.І.");
        reader3.setTiketName(345);
        reader3.setDateBirth(1992-02-02);
        reader3.setFakultetName("Математичний факультет");
        reader3.setPhoneNumber("0951234567");
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println(reader1.getreaderInfo());
        System.out.println(reader2.getreaderInfo());
        System.out.println(reader3.getreaderInfo());
reader1.takeBook
        System.out.println("Петров В.В. взяв "+ Book.getBookCount()+" книги");
    }
}