package tutorial3;

public class Cylinder extends Point{
private double height;
private double radius;

public Cylinder(int x, int y, double h, double r) {
	super(x,y);
	height = h;
	radius= r;
}
public void setHeight(double h) {
	height= h;
}
public double getHeight() {
	return height;
}

public void toString2() {
	super.toString();
}
public double cylinArea() {
	double area;
	area = 2* 3.142 * radius * height + 2* radius * radius* 3.142;
	return area;
	
}
public double volume() {
	double vol;
	vol = 3.142 * radius * radius * height;
	return vol;
}
}

