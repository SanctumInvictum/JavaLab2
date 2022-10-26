package com.BVT2105;

import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input Point");
        // Ввод координат 3 точек в трехмерном пространстве
        Point3d A = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Input Point");
        Point3d B = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Input Point");
        Point3d C = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        //Обработка исключений и вывод результатов
        if (A.equals(B)||B.equals(C)||C.equals(A))
            System.out.println("Ошибка: Есть равные точки");
        else
            System.out.println("The area of the triangle = " + computeArea(A, B, C));
    }
    // Метод, принимающий 3 точки и считающий площадь по формуле Герона
    public static double computeArea(Point3d A, Point3d B, Point3d C) {
        if (A.isEqualTo(B) || B.isEqualTo(C) || C.isEqualTo(A)) {
            System.out.println("Whoops, it looks like your triangle isn't a triangle.");
            return -1;
        }
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double CA = C.distanceTo(A);
        double p = (AB+BC+CA)/2.0;
        return Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
    }
}