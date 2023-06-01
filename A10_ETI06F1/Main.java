/*
 *
 * https://pl.spoj.com/problems/ETI06F1/
 * Pole pewnego koła
 */

package A10_ETI06F1;

import java.util.Scanner;

/**
 * Program obliczający pole koła na podstawie promienia i odległości między środkami sfer.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble(); // promień sfery
        double distance = scanner.nextDouble(); // odległość między środkami sfer

        double pi = 3.141592654;

        double output = calculateCircleArea(radius, distance, pi);
        System.out.println(output);

        scanner.close();
    }

    /**
     * Metoda obliczająca pole koła na podstawie promienia i odległości między środkami sfer.
     *
     * @param radius   promień sfery
     * @param distance odległość między środkami sfer
     * @param pi       wartość liczby pi
     * @return pole koła
     */
    public static double calculateCircleArea(double radius, double distance, double pi) {
        double radiusSquared = Math.pow(radius, 2);
        double distanceSquared = Math.pow(distance, 2) / 4;
        double area = (radiusSquared - distanceSquared) * pi;
        area = Math.round(area * 100) / 100.0; // zaokrąglenie do dwóch miejsc po przecinku

        return area;
    }
}

/*
 * Program oblicza pola koła na podstawie podanego promienia (radius) i odległości między środkami sfer (distance).
 * Algorytm polega na wczytaniu promienia i odległości z wejścia, a następnie wykorzystaniu tych wartości do obliczenia pola koła.
 * Wartość liczby pi jest przyjęta jako 3.141592654.
 * Metoda calculateCircleArea przyjmuje promień, odległość i wartość liczby pi jako parametry,
 * a następnie wykonuje obliczenia na podstawie tych danych.
 * Wynik, reprezentujący pole koła, jest zaokrąglany do dwóch miejsc po przecinku i wypisywany na standardowym wyjściu.
 */