package com.company;


import java.util.Scanner;

import static java.lang.StrictMath.sqrt;


public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        int b = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        int a1 = in.nextInt();
        Scanner in3 = new Scanner(System.in);
        int b1 = in1.nextInt();
        p1.setX(a);
        p1.setY(b);
        p2.setX(a1);
        p2.setY(b1);
        double distance = sqrt(Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()),2));
        System.out.println("The distance is: "+ distance);

    }

}
