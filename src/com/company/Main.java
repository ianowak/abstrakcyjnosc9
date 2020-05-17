package com.company;

public class Main {

    public static void main(String[] args) {

        int tab[] = {10, 20, 30, 10, 20};
        int x = 30;

        Wyszukiwanie nowe = new Wyszukiwanie();
        int index = nowe.szukaj(tab, 30, new SprawdzenieRownych());
        if (index == -1) System.out.println("nie znaleziono");
        else System.out.println("znaleziono w indeksie numer: " + index);
    }
}

interface Sprawdzenie {
    boolean porownaj(int a, int b);
}

class Wyszukiwanie {

    public int szukaj(int a[], int ele, Sprawdzenie sprawdzenie) {
        for (int i = 0; i < a.length; i++) {
            if (sprawdzenie.porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}

class SprawdzenieRownych implements Sprawdzenie {

    public boolean porownaj(int a, int b) {
        return a == b;
    }
}