
class A12{
	void f1()
	{
		System.out.println("Default Fn");
	}
	
	void f1(int x,int y)
	{
		System.out.println(x+y);
	}
	
	void f1(int x,int y,int z)
	{
		System.err.println(x+y+z);
	}
	
}

public class OverloadDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A12 obj = new A12();
		obj.f1();
		obj.f1(23,34);

	}

}
