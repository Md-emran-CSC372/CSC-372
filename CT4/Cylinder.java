package CT4;

public class Cylinder extends Shape{
	private double radius, height;

	public Cylinder(double radius, double height) {
	this.radius = radius;
	this.height = height;
}
	@Override
	public double surface_area() {
	double surfaceArea = 2 * Math.PI * (radius + height);
	return surfaceArea;
	}

	@Override
	public double volume() {
	double volume = Math.PI * radius * radius * height;
	return volume;
	}

	@Override
	public String toString() {
	return "Cylinder [surface_area =" + surface_area() + ", volume =" + volume() + "]";
	}

	}
