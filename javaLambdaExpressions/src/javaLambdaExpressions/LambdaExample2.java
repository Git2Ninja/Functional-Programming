package javaLambdaExpressions;
@Functional
interface Shape{
	void draw();

}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("Rectangle drawing");
	}
}

public class LambdaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = () -> System.out.println("Rectangle");	
		Shape circle = () -> System.out.println("Drawing a Circle with a radius of 5");
		Shape square = () -> System.out.println("Drawing a Square with side length 10");
		Shape triangle = () -> System.out.println("Drawing a Triangle with base 8 and height 6");
		
		draw(circle);
		draw(square);
		draw(triangle);
		draw(rectangle);
	}
	
	private static void draw(Shape shape) {
		shape.draw();
	}
}
