package com.company;

import com.company.model.Figure;
import com.company.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.toString());
        System.out.println("Периметр фигуры равен " + triangle.getPerimeter());
    }
}