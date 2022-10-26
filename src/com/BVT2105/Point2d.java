package com.BVT2105;

// Двyмеpный клаcc тoчки
public class Point2d {
    // Координаты X и Y
    private double xCoord;
    private double yCoord;

    // Конструктор инициализации
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    // Конструктор по умолчанию
    public Point2d () {
        this(0, 0);
    }
    // Возвращение координат X и Y
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    // Установка значений координат X и Y
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    // Метод сравнения значений полей объектов
    public boolean isEqualTo(Point2d other) {
        if (xCoord == other.getX() && yCoord == other.getY()) {
            return true;
        }
        return false;
    }
    // Метод расчета расстояния между двумя точками
    public double distanceTo(Point2d other) {
        return Math.sqrt(Math.pow(xCoord - other.getX(),2) + Math.pow(yCoord - other.getY(),2));
    }
}