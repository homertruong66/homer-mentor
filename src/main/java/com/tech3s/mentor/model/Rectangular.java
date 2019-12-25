package com.tech3s.mentor.model;

public class Rectangular extends Shape {
    
    private int width;
    private int height;
    
    @Override
    public void draw() {
        System.out.println("Draw the Rectangular with width=" + this.getWidth() + " and height=" + getHeight()  + " and color=" + getColor());
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing the Rectangular...");
        System.out.println("Erased the Rectangular with width=" + this.getWidth() + " and height=" + getHeight() + " done!");
    }
    
    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangular: " + this.getWidth() * this.getHeight());
    }
    
    // getters/setters
    private int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    private int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
}
