package com.pb.zhitnikov.hw5;
public class Reader {
    private static int bookCount = 0;
    public static int getBookCount() {
        return bookCount;
    }
    private String name;
        private int tiketName;
        private String fakultetName;
        private int dateBirth;
        private String phoneNumber;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getTiketName() {return tiketName;}
    public void setTiketName(int tiketName) {this.tiketName = tiketName;}
    public String getFakultetName() {return fakultetName;}
    public void setFakultetName(String fakultetName) {this.fakultetName = fakultetName;}
    public int getDateBirth() {return dateBirth;}
    public void setDateBirth(int dateBirth) {this.dateBirth = dateBirth;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getreaderInfo() {
        return "[ПІБ читача " + name + " " + dateBirth + "р. народження, читацький квиток №" + tiketName +
                ", вчиться " + fakultetName + ", номер телефону " + phoneNumber + "]";
    }
    public String takeBook (int bookCount) {
return " взяв книги: " + bookCount;
           }
    public String takeBook(Book book1, Book book2, Book book3) {
        return " взяв книги: "+book1.getBookName()+", "+book2.getBookName()+", "+book3.getBookName();
    }
    public String takeBook (Book book1, Book book2, Book book3, Reader reader1) {
        return " взяв книги: "+book1.getInfo()+", "+book2.getInfo()+", "+book3.getInfo();
    }
    public String returnBook (int bookCount) {
        return " повернув книги: " + bookCount;
    }
    public String returnBook (Book book1, Book book2, Book book3) {
        return " повернув книги: "+book1.getBookName()+", "+book2.getBookName()+", "+book3.getBookName();
    }
    public String returnBook (Book book1, Book book2, Book book3, Reader reader1) {
        return " повернув книги: "+book1.getInfo()+", "+book2.getInfo()+", "+book3.getInfo();
    }
}