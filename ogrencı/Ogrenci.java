package com.company;

public class Ogrenci {
    public Ogrenci(int no, int vize, int genel) {
        this.no = no;
        this.vize = vize;
        this.genel = genel;
    }

private final int no;
private final int vize;
private final int genel;


    public int getNo() {
        return no;
    }

    public int getVize() {
        return vize;
    }

    public int getGenel() {
        return genel;
    }
}
