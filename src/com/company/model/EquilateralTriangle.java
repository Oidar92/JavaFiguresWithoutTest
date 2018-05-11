package com.company.model;

public class EquilateralTriangle extends IsoscelesTriangle {

    public EquilateralTriangle(double side) {
        this.name = "Равносторонний треугольник";
        this.firstSide = this.secondSide =
            this.thirdSide = side;
    }

    @Override
    public String toString() {
        return name + " со стороной " + firstSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide * 3;
    }
}
