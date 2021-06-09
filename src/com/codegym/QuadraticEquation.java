package com.codegym;

public class QuadraticEquation {
    private double a, b, c, delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


        if (this.a == 0) {
            if (this.b == 0) {
                System.out.println("vo nghiem");
            } else {
                System.out.println("co 1 nghiem:" + "Root = " + (-this.c / this.b));
            }
        }
        return;
    }


    // trả về delta:

    public double getDiscriminant() {
        delta = (this.b * this.b) - 4 * this.a * this.c;
        return delta;
    }

    //trả về nghiệm x1:
    public double getRoot1() {

        return (-this.b + Math.sqrt(delta)) / 2 * this.a;
    }

    //trả về nghiệm x2:
    public double getRoot2() {

        return (-this.b - Math.sqrt(delta)) / 2 * this.a;
    }


}
