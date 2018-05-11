package com.company.model;

public class Triangle extends Figure {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;

    public Triangle() {
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        if(validate(firstSide, secondSide, thirdSide)) {
            this.name = "Треугольник";
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
        }
    }

    private boolean validate(double firstSide, double secondSide, double thirdSide){
        return (firstSide + secondSide > thirdSide) &&
               (secondSide + thirdSide > firstSide) &&
               (firstSide + thirdSide > secondSide);
    }

    @Override
    public String toString() {
        return name + " со сторонами " +  firstSide +
                ", " + secondSide + ", " + thirdSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
