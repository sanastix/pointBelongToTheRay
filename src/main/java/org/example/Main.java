package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        scan.close();

        // Особливий випадок: точка збігається з початком променя
        if (x == x1 && y == y1) {
            System.out.println("YES");
            return;
        }

        // Обчислення коефіцієнтів
        double xAB = x2 - x1;
        double yAB = y2 - y1;
        double xAC = x - x1;
        double yAC = y - y1;

        // Особливий випадок: вертикальний вектор AB
        if (xAB == 0) {
            if (xAC == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }

        // Особливий випадок: горизонтальний вектор AB
        if (yAB == 0) {
            if (yAC == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }

        // Обчислення коефіцієнтів kAB та kAC
        double kAB = yAB / xAB;
        double kAC = yAC / xAC;

        // Перевірка, чи точка належить променю
        if (Math.abs(kAB - kAC) < 1e-9) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}