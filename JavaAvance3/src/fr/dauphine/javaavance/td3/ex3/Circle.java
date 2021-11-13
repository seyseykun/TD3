package fr.dauphine.javaavance.td3.ex3;

public class Circle {

	private double radius;
	private Point center;

	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Centre : " + center + " Rayon : " + radius + " Aire : " + area();
	}

	public void translate(double dx, double dy) {
		center.translate(dx, dy);
	}

	public Point getCenter() {
		return new Point(center);
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public boolean contains(Point p) {
		return (Math.pow(Math.sqrt(center.getX() - p.getX()), 2)
				+ Math.pow(Math.sqrt(center.getY() - p.getY()), 2)) < Math.pow(radius, 2);
	}

	public boolean contains(Point p, Circle... circles) {
		for (Circle c : circles)
			if (c.contains(p))
				return true;
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Circle) obj).radius == radius && ((Circle) obj).center.equals(center);
	}

	public double getRadius() {
		return radius;
	}

}
