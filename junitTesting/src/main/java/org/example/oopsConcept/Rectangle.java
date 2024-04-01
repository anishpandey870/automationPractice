package org.example.oopsConcept;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double areaOfRectangle(int width , int height){
        double area=width*height;
        return area;
    }
    public int perimterOfRectangle(int width,int height){
        int perimeter=2*(width*height);
        return perimeter;
    }
}
