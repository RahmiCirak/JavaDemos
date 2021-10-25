package com.company;

public class OgrenciManager {
int vize,genel,no;

 public OgrenciManager(Ogrenci[] ogrenci){
for (Ogrenci ogrenciler :ogrenci){
    this.vize=ogrenciler.getVize();
    this.genel=ogrenciler.getGenel();
    this.no=ogrenciler.getNo();
    ogrenciBilgileri();
    System.out.println(Ortalama()+"\n"+GecmeDrumu());
    System.out.println("-------------------------------");}

    }

    double Ortalama(){
        return (vize * 0.4) + (genel * 0.6);
 }
    String GecmeDrumu(){
        if (Ortalama()<=50){
            return "Kaldı ";
        }
        return "Geçti ";
    }
    void ogrenciBilgileri (){
        System.out.println(no+" "+vize+" "+genel);
    }
}
