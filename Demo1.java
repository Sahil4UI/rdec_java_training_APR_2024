import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//kind of template
@FunctionalInterface
interface Run<T>{
	void traverse(T x);
}

//interface Run1
//{
//	void X(int x,int y);
//}

class MyRun implements Run{	
	@Override
	public void traverse(Object x) {
		// TODO Auto-generated method stub
		System.out.println("X is "+x);
	}
}

public class Demo1 {
	static ArrayList<Integer> l = new ArrayList<>(50);
	static ArrayList<String> s = new ArrayList<>();
	
	static void forEach(Run<Integer> run) {
		for(int i = 0 ; i<l.size(); i++) {
			run.traverse(l.get(i));
		}
	}
	
	public static void main(String[] args) {
		
//		
		// TODO Auto-generated method stub
//		l.add(100);
//		l.add(200);
//		l.add(300);
//		l.add(300);
//		l.add(300);
//		l.add(10);
//		l.add(20);
//		l.add(1,10000);
////		System.out.println("NOW PRINTING *********************");
//		forEach(new MyRun());
//		System.out.println(l);
//		l.remove(0);
//		System.out.println("After Remove "+l);
////		update
//		l.set(0, 888888);
//		System.out.println("After Update "+l);
//		System.out.println(l.contains(30000)?
//				"Found":"Not Found");
//		System.out.println("Single "+l.get(0));
//		System.out.println(l.indexOf(300));
//		System.out.println(l.lastIndexOf(300));
//		
		
//		Collections.sort(l);
////		
//		System.out.println("After Sort "+l);
//		Collections.sort(l,Collections.reverseOrder());
//		System.out.println("After Sort Desc "+l);
//		System.out.println(l.size());
//		l.trimToSize();
//		System.out.println(l.size());
//		// Traverse
//		System.out.println("******************************");
//		for(int i= 0; i<l.size(); i++) {
//			System.out.println(l.get(i));
//		}
////		 Enhance for loop
//		for(int i : l) {
//			System.out.println(i);
//		}
////		Iterator is a class used to iterate a collection
//		Iterator<Integer> i = l.iterator();
//		while(i.hasNext()) {
////			i.next();
//			System.out.println(i.next());
//			i.remove();
//		}
//		System.out.println("ArrayList="+l);
//////		
		ListIterator<Integer> i = l.listIterator();
		while(i.hasNext()) {
				System.out.println(i.next());
//////				i.remove();
			}
		System.out.println("******************************");
 		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}

////		// for each
		l.forEach((ele)->
		System.out.println(ele));
////		
		System.out.println(l.toString());
////		
//		
//		

	}

}
