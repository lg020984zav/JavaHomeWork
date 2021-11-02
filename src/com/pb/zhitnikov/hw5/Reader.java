package com.pb.zhitnikov.hw5;
public class Reader {
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
                " вчиться " + fakultetName + " номер телефону " + phoneNumber + "]";
    }
}