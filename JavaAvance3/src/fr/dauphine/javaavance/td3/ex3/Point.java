package fr.dauphine.javaavance.td3.ex3;

public class Point {

	private double x, y;
	private static int nbPointCrees = 0;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		++nbPointCrees;
	}

	public Point(Point p2) {
		this.x = p2.getX();
		this.y = p2.getY();
	}

	public Point() {
	}

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.x + " " + p.y);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public boolean isSameAs(Point p) {
		return x == p.x && y == p.y;
	}

	@Override
	public boolean equals(Object obj) {
		return x == ((Point) obj).x && y == ((Point) obj).y;
	}

	public Point translate(double dx, double dy) {
		return new Point(x + dx, y + dy);
	}

}