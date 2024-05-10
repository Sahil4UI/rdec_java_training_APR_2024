class Shape{
	int radius,length,breadth,side;
	
}
class Circle extends Shape{
	
	void getInput(int r)
	{
		radius = r;
	}
	
	void area()
	{
		System.out.println("Area of Circle:"+3.14*radius*radius);
	}
}

class Rect extends Shape{
	
	void getInput(int l,int b)
	{
		length =l;
		breadth=b;
	}
	
	void area()
	{
		System.out.println("Area of Rect :"+length*breadth);
	}
}

class Square extends Shape{
	void getInput(int s)
	{
		side = s;
	}
	void area()
	{
		System.out.println("Area of Square :"+side*side);
	}
}

public class CastingDemo {
	static void commonCaller(Shape shape)
	{
		if (shape instanceof Circle)
		{
//			downcasting
			Circle obj1 = (Circle)shape;
			obj1.getInput(19);
			obj1.area();
		}
		else if (shape instanceof Square)
		{
			Square obj1 = (Square)shape;
			obj1.getInput(19);
			obj1.area();
		}
		else {
			Rect obj1 = (Rect)shape;
			obj1.getInput(19,34);
			obj1.area();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		upcasting
//		Shape circle = new Circle();
		commonCaller(new Circle());
		commonCaller(new Square());
		commonCaller(new Circle());	
	}

}
