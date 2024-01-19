package org.example;


import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        //Fibonacci dizisi, her sayının önceki iki sayının toplamı olduğu bir dizidir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci serisinin kaçıncı elemanını bulmak istiyorsunuz?");
        int n = scan.nextInt();

        System.out.println("Fibonacci serisinin " + n + ". elemani: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}