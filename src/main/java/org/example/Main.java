package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double  a, b, mediaPonderada;

        a = sc.nextDouble();

        b = sc.nextDouble();

        mediaPonderada = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", mediaPonderada);

      sc.close();
    }
}