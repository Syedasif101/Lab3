class Shape{
	final double PI=3.14;
	float radius;
	float side;
	
	void display() {
		System.out.println("The Area of various shapes are:");
	}
	
}
class Circle extends Shape{
	
	
	void getArea(float radius) {
		super.display();
		
		this.radius=radius;
		
	}
	void display() {
		System.out.println("Area of the Circle is"+" "+PI*Math.pow(radius,2));
	}
	
}
class Square extends Shape{
	void getArea(int side) {
		this.side=side;
		
	}
	void display() {
		System.out.println("Area of the square is"+" "+side*side);
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.getArea(3);
		c.display();
		Square s=new Square();
		s.getArea(2);
		s.display();

	}

}
