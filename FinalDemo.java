//Final Keyword -> class,method,variable

//class A2{
//	final methods cannot be overriden
//	final void show()
//	{
//		System.out.println("Show of A2 gets called..");
//	}
//}
//
//class B2 extends A2{
//	@Override
//	void show()
//	{
//		System.out.println("SHow of B2 gets called..");
//	}
//}
// Final Class cannot be inherited
//final class C{
//	int x,y,z;
//	void show()
//	{
//		System.out.println(x+y+z);
//	}
//}
//
//class D extends C{
//	
//}
class OverloadDemo{
	void f1()
	{	System.out.println("Default"); }
	void f1(int x)
	{   System.out.println(x);         }
	void f1(int x,int y)
	{
		System.out.println("x = "+x+",y="+y); }
}
public class FinalDemo {
	public static void main(String[] args) {
		OverloadDemo obj = new OverloadDemo();
		obj.f1();
		obj.f1(23);
	}
}
