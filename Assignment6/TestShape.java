package assignment6;

abstract class GeometricShape
{
	abstract  public void area();
	abstract public void perimeter();
	
}
class circle extends GeometricShape
{
 final double PI=3.14;
 double radius;
 public circle(int radius)
 {
	 this.radius=radius;
 }
	@Override
	public void area() {
	System.out.println("area of circle is "+(PI*radius*radius));
	}

	@Override
	public void perimeter() {
		
		System.out.println("perimeter of circle is "+(2*PI*radius));
	}
	
}
class rectangle extends GeometricShape
{
private int l,b;

	@Override
	public void area() {
		System.out.println("area of rectangle is "+(l*b));
		
	}

	@Override
	public void perimeter() {
		System.out.println("perimeter of rectangle is "+2*(l*b));
		
	}
	
}
class triangle extends GeometricShape
{
private int a,b;
	@Override
	public void area() {
		System.out.println("area of triangle is "+((1/2)*a*b));
		
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}
	
}
public class TestShape {

	public static void main(String[] args) {
		circle c=new circle(2);
		c.area();
		c.perimeter();

	}

}
