package com.company;

import com.company.model.EquilateralTriangle;
import com.company.model.Figure;
import com.company.model.IsoscelesTriangle;
import com.company.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.toString());
        System.out.println("Периметр фигуры равен " + triangle.getPerimeter());
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3, 5);
        System.out.println(isoscelesTriangle.toString());
        System.out.println("Периметр фигуры равен " + isoscelesTriangle.getPerimeter());
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);
        System.out.println(equilateralTriangle.toString());
        System.out.println("Периметр фигуры равен " + equilateralTriangle.getPerimeter());
    }
}