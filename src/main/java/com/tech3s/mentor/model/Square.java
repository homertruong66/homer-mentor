package com.tech3s.mentor.model;

public class Square extends Shape {
    
    private int edge;
    
    @Override
    public void draw() {
        System.out.println("Draw the Square with edge=" + this.getEdge() + " and color=" + getColor());
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing the Square...");
        System.out.println("Erased the Square with edge=" + getEdge() + " done!");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Square: " + this.getEdge() * this.getEdge());
    }
    
    // getters/setters
    public int getEdge() {
        return edge;
    }
    
    public void setEdge(int edge) {
        this.edge = edge;
    }
}
