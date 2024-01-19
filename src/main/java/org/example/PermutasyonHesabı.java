package org.example;

import java.util.Scanner;

public class PermutasyonHesabı {

    public static void main(String[] args) {
        //Permütasyon, n elemanlı bir kümenin k elemanlı alt kümelerinin k kere yer değiştirme sayısıdır.
        Scanner scan = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scan.nextInt();

        System.out.print("k değerini giriniz: ");
        int k = scan.nextInt();

        if(n < 0 || k < 0 || n < k){
            System.out.println("Geçersiz sayılar girdiniz!");
        }else{
            int hesapla = Permutasyon(n,k);
            System.out.println("P(" + n + "," + k +") sonucu = " + hesapla);
        }

    }
    public static int Permutasyon(int n, int k){
        int sonuc = 1;
        for(int i = 0; i < k; i++){
            sonuc *= (n-i);
        }
        return sonuc;

    }
}
