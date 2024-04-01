package org.example.oopsConcept;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI*getRadius()*getRadius();
    }
    public double cercummferance(){
        return 2*Math.PI*getRadius();
    }

}
