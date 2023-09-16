package CT4;

public class Driver {

	public static void main(String[] args) {
		
		Sphere sphere = new Sphere(5.0);
		Cylinder cylinder = new Cylinder(3, 7);
		Cone cone = new Cone(21, 3);
		Shape[] shapeArray = {sphere,cylinder,cone};
		for(Shape shape: shapeArray) {
		System.out.println(shape.toString());
		}
		

	}

}
