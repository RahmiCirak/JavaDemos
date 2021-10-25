package com.company;

public class LinkedList {
    private Object first;
    private Object end;

    public LinkedList() {
        first = null;
        end = null;

    }

    int elemanSayisi() {
        Object temp = first;

        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    Object degerGoster(int index) {
        Object temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;


    }

    public void sonaElemanEkle(Object obje) {

        if (end == null) {
            first = obje;
            end = obje;
        } else {
            end.next = obje;
            end = end.next;
        }
    }


    public void basaElemanEkle(Object obje) {

        if (first == null) {
            first = obje;
            end = obje;
        } else {
            obje.next = first;
            first = obje;
        }
    }


    public void parametreliEkle(Object obje, int index) {

        if (index == 0) {
            basaElemanEkle(obje);
        } else if (index == elemanSayisi() - 1) {
            sonaElemanEkle(obje);
        } else {
            Object temp = first;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            obje.next = temp.next;
            temp.next = obje;
        }
    }

    private void sondanSil() {
        Object temp = first;
        while (temp.next != end) {
            temp = temp.next;
        }
        end = temp;
        temp.next = null;

    }

    private void bastanSil() {
        first = first.next;
    }

    void parametreliSil(int index) {
        Object temp = first;
        if (index == 0) {
            bastanSil();
        } else if (index == elemanSayisi() - 1) {
            sondanSil();
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

}
