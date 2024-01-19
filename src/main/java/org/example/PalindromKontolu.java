package org.example;

import java.util.Scanner;

public class PalindromKontolu {
    public static void main(String[] args) {
        //Palindrom, tersten okunuşu da aynı olan sayılar.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if (PalindromSayi(sayi)){
            System.out.println(sayi + " Palindrom sayıdır!");
        }else {
            System.out.println(sayi + " Palindrom sayı değildir!");
        }

    }
    public static boolean PalindromSayi (int sayi){
        int duzSayi = sayi;
        int tersSayi = 0;

        while(sayi>0){
            int basamak= sayi % 10;
            tersSayi = tersSayi * 10 + basamak;
            sayi /= 10;
        }
        return duzSayi == tersSayi;
    }
}
