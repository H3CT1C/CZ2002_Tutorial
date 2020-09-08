package tutorial3;

public class Circle extends Point {
private double radius;
	
	public Circle(int x, int y, double rad)
	{	
		super(x,y);
		radius= rad;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void toString1() {
		super.toString();
	}
	public double area() {
		return 3.142* radius*radius;
	}
}
