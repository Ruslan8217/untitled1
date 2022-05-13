package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sideA = new ArrayList<String>();
        ArrayList<String> sideB = new ArrayList<String>();
        ArrayList<String> sideC = new ArrayList<String>();


        System.out.println("Enter the name: ");
        for (int i = 0; i < 5; i++) {
            sideA.add(scanner.nextLine());

        }
        System.out.println(sideA);
        System.out.println("Enter the next 5 names: ");
        for (int i = 0; i < 5; i++) {
            sideB.add(scanner.nextLine());

        }
        System.out.println(sideB);

        Collections.reverse(sideB);
        System.out.println(sideB);
        Integer x = 0;
        while (sideC.size() < sideA.size() + sideB.size()) {
            sideC.add(sideA.get(x));
            sideC.add(sideB.get(x));
            x++;
        }

        System.out.println(sideC);
        Collections.sort(sideC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        System.out.println(sideC);
    }

}
