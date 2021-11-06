package com.pb.zhitnikov.hw5;

public class Book {

    private String bookName;
    private String bookAuthor;
    private int bookYear;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    String getInfo() {
        return "[" + bookName + " (" + bookAuthor + " " + bookYear + "]";
    }

}