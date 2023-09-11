package NesoAcademypractise;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class arrayExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements ? (Max value 20): ");
        int n = input.nextInt();

        while(n > 20 || n <=0){
            System.out.println("Invalid value! Please try again. ");
            n = input.nextInt();

        }
        Point[] points = new Point[n];
        fillArrayOfPoints(points);
        printArrayOfPoints(points);


    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.print("The elements are: ");
        for(int i = 0; i<points.length;i++)
            System.out.print("(" +points[i].x+ ", " +points[i].y+ ")");
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for points:" + i + 1 + ": ");
            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }
}
