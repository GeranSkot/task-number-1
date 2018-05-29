package com.Aleksey;

public class Main {

    public static void main(String[] args) {
        int i, j, k;
        i = Integer.parseInt(args[0]);
        j = Integer.parseInt(args[1]);
        k = Integer.parseInt(args[2]);

        System.out.println("\n Введенные числа: " + i + " " + j + " " + k);
        System.out.println("\n Все возможные комбинации: \n");
        if ((i != j) && (j != k) && (k != i)) {
            System.out.print(i + " " + j + " " + k + " ");
            System.out.print(i + " " + k + " " + j + " ");
            System.out.print(j + " " + i + " " + k + " ");
            System.out.print(j + " " + k + " " + i + " ");
            System.out.print(k + " " + i + " " + j + " ");
            System.out.print(k + " " + j + " " + i + " \n");
        } else {
            if ((i == j) && (i == k))
                System.out.print(i + " " + j + " " + k + " \n");
            else {
                if (i == j) {
                    System.out.print(i + " " + j + " " + k + " ");
                    System.out.print(i + " " + k + " " + j + " ");
                    System.out.print(k + " " + j + " " + i + " \n");
                } else {
                    if (i == k) {
                        System.out.print(i + " " + k + " " + j + " ");
                        System.out.print(i + " " + j + " " + k + " ");
                        System.out.print(j + " " + k + " " + i + " \n");
                    } else {
                        System.out.print(j + " " + k + " " + i + " ");
                        System.out.print(j + " " + i + " " + k + " ");
                        System.out.print(i + " " + j + " " + k + " \n");
                    }
                }
            }
        }
    }
}