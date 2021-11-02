package com.pb.zhitnikov.hw5;

public class Book {
    private static int bookCount;
    private String bookName;
    private String bookAuthor;
    private int bookYear;
    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}
    public String getBookAuthor() {return bookAuthor;}
    public void setBookAuthor(String bookAuthor) {this.bookAuthor = bookAuthor;}
    public int getBookYear() {return bookYear;}
    public void setBookYear(int bookYear) {this.bookYear = bookYear;}
    public static int getBookCount() {return bookCount;}
    public void setBookCount(int bookCount) {this.bookCount = bookCount;}
    String getInfo() {return "[" + bookName + " (" + bookAuthor + " " + bookYear + "]";}

    public void takeBook(String bookName, String bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        bookCount++;
        System.out.println("Петров В.В. взяв "+bookCount+"книги");
    }

    public void takeBook(String bookName){
        System.out.println("Петров В.В. взяв книги: ");
    }
}