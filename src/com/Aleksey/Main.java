package com.Aleksey;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int number;
        System.out.print("enter the digit: ");
        Scanner numb = new Scanner(System.in);
        if (numb.hasNextInt()) {
            number = numb.nextInt();
            for ( int i=2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("simple ");
                    break;
            } else {
                    System.out.println("not simple");
                    break;
                }
            }
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("not even");
            }
        } else {
            System.out.println("smt going wrong");
        }

    }
}

