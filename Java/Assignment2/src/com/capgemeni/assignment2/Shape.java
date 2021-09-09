package com.capgemeni.assignment2;
class Shape
{  
void draw()
{
	System.out.println("Draw the shape"); 
}  
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Shape s;
	s=new Rectangle();
	s.draw();
	s=new Circle();
	s.draw();
	s=new Cube();
	s.draw();s=new Cube();
	s.draw();
	s=new Line();
	s.draw();
}

}
class Rectangle extends Shape
{  
void draw()
{
	System.out.println("draw rectangle..");
}  
}  
class Cube extends Shape
{  
void draw()
{
	System.out.println("draw cube..");
}  
}  
class Circle extends Shape
{  
void draw()
{
	System.out.println("draw circle..");
}  
}  

class Line extends Shape
{  
void draw()
{
	System.out.println("draw Line..");
}  
}  