package com.company;
/*
    bir class da ogrenci bilgileri sorna not hesaplaması en son main de çagırıyosun

    dersin devamı swing ile devam etti
    son çıktıda öğrencinin bilgilerini yazıp bul butonuna tıkladık sonrasında hesapla ediğimize ogencini notları ve
    ortalamasını verecek ve geçip geçmediğini söyleyecek


    */

import java.util.Scanner;

public class Main {
static  int a=2;
    public static void main(String[] args) {
Ogrenci[] ogrenciler =new Ogrenci[a];

        Scanner scanner =new Scanner(System.in);

        System.out.println("sırasıyla ' no , vize , genel '");

for (int i=0;i<a;i++){
    ogrenciler[i]=new Ogrenci(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
}
OgrenciManager manager =new OgrenciManager(ogrenciler);




    }
}
