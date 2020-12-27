package ex;

public class Prob8 {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];
		
		shape[ 0 ]  = new Circle("원",10);
		shape[ 1 ] = new Rectangular("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}
	}

}

abstract class Shape{
	protected double area;
	private String name;
	
	public Shape() {
		super();
	}
	public void print() {
		System.out.printf("%s의 면적은 %f %n",name,area);
	}
	
	public abstract void calculationArea(); 
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}


class Circle extends Shape{
	private double r;

	public Circle() {}
	public Circle(String name,double r) {
		super(name);
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public void calculationArea() {
		super.area = Math.PI*r*r;
	}
	
	
}

class Rectangular extends Shape{
	private double w;
	private double h;
	
	public Rectangular() {}
	public Rectangular(String name, double w, double h) {
		super(name);
		this.w = w;
		this.h = h;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	@Override
	public void calculationArea() {
		super.area = w*h;
	}
}





