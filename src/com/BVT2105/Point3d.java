package com.BVT2105;

// трехмерный класс точки
public class Point3d extends Point2d {
    // Координата Z
    private double zCoord;

    // Конструктор инициализации
    public Point3d (double x, double y, double z){
        super (x, y);
        zCoord=z;
    }

    // Конструктор по умолчанию
    public Point3d () {
        this(0.0, 0.0, 0.0);
    }
    // Возвращение координаты Z
    public double getZ () {
        return zCoord;
    }

    // Установка значения координаты Z
    public void setZ ( double val) {
        zCoord = val;
    }
    // Метод сравнения значений полей объектов
    public boolean isEqualTo(Point3d other) {
        if (super.getX() == other.getX() && super.getY() == other.getY() && zCoord == other.getZ()) {
            return true;
        }
        return false;
    }
    // Метод расчета расстояния между точками
    public double distanceTo(Point3d other) {
        return Math.sqrt(Math.pow(super.getX() - other.getX(),2) + Math.pow(super.getY() - other.getY(),2) + Math.pow(zCoord - other.getZ(),2));
    }
}