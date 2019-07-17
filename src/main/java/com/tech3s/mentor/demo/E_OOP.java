package com.tech3s.mentor.demo;

import com.tech3s.mentor.model.Circle;
import com.tech3s.mentor.model.Rectangular;
import com.tech3s.mentor.model.Shape;
import com.tech3s.mentor.model.Square;

public class E_OOP {
	
	// Main Program
	public static void main(String[] args) {
        System.out.println("Play with some types of Shape...\n");

		Rectangular rectangular = new Rectangular();
		rectangular.setWidth(66);
		rectangular.setHeight(12);
		rectangular.setColor("RED");
		playWithShape(rectangular);

		Square square = new Square();
		square.setEdge(96);
		square.setColor("GREEN");
		playWithShape(square);

		Circle circle = new Circle();
		circle.setRadius(110);
		if (circle.getRadius() > Shape.MAX_WIDTH) {
			circle.setRadius(Shape.MAX_WIDTH);
		}
		circle.setColor("BLUE");
		playWithShape(circle);
	}

	
	// Utilities
	private static void playWithShape(Shape shape) {
		System.out.println(shape);	// inheritance
		shape.draw();				// polymorphism
		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.draw("RED");
		}
		shape.area();				// polymorphism
		shape.erase();				// polymorphism
		System.out.println();
	}

}
