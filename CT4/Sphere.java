package CT4;

public class Sphere extends Shape{
	private double radius;

	public Sphere(double radius) {
	super();
	this.radius = radius;
	}

	@Override
	public double surface_area() {
	return 4 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {
	return (4 / 3) * Math.PI * radius * radius * radius;
	}

	@Override
	public String toString() {
	return "Sphere [surface_area =" + surface_area() + ", volume =" + volume() + "]";
	}

	}

