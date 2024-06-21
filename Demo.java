import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//import java.util.*;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		String x = "25";
//		ArrayList <Integer> x = new ArrayList<>();
//		x.add(50);
//		x.add(20);
//		x.add(90);
//		System.out.print("before adding:"+x);
//		Integer y = 9000;
//		x.add(0,100);
//		System.out.println(x);
//		x.remove(0);	
//		x.remove(y);
//		System.out.println(x);
//		System.out.println("Length = "+x.size());
		Set<String> x = new HashSet<>();
//		set cannot store duplicate values
		x.add("a");
		x.add("b");
		x.add("b");
		x.add("c");
		x.add("d");
		x.add("d");
		x.add("e");
		System.out.println(x);
		x.remove("d");
		x.clear();
		System.out.println(x);
//		

		
	}

}
