package CT4;

public class Cone extends Shape {

	private double radius, height;

	public Cone(double radius, double height) {
	super();
	this.radius = radius;
	this.height = height;
	}

	@Override
	public double surface_area() {
	double surfaceArea = (radius * Math.PI) * radius + Math.sqrt(height * height + radius * radius);
	return surfaceArea;
	}

	@Override
	public double volume() {
	double volume = Math.PI * radius * radius * (height / 3);
	return volume;
	}

	@Override
	public String toString() {
	return "Cone [surface_area =" + surface_area() + ", volume =" + volume() + "]";
	}

	
}
