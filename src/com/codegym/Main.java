package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        double a = scanner.nextDouble();
        System.out.println("enter b:");
        double b = scanner.nextDouble();
        System.out.println("enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        System.out.println("");
        System.out.println("Discriminant: "+quadraticEquation.getDiscriminant());
        System.out.println("Root1: "+quadraticEquation.getRoot1());
        System.out.println("Root2: "+quadraticEquation.getRoot2());
    }
}
