package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet x: ");
        double x = sc.nextDouble();

        double guess = x / 2.0;
        System.out.printf("%.3f ", guess);
        System.out.print(" " + x/guess + "\n");
        while(Math.abs(guess-x/guess) > 0.001) {
            guess = (guess + x/guess) / 2.0;
            System.out.printf("%.3f ", guess);
            System.out.print(" " + x/guess + "\n");



        }


    }
}
