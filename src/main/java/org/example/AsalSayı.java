package org.example;

import java.util.Scanner;

public class AsalSayı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal sayıdır!.");
        }
        else {
            System.out.println(sayi + " Asal sayı değildir!");
        }
    }
}
