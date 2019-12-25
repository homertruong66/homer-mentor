package com.tech3s.mentor.model;

public abstract class Shape {

    public static int MAX_WIDTH = 100;
    
    private String color;
    
    public abstract void draw();

    public abstract void erase();

    public abstract void calculateArea();

    
    // getters/setters
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Shape{type=" + this.getClass().getSimpleName() +
                ", color='" + color + '\'' +
                '}';
    }
}
