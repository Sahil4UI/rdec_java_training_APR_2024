import java.util.HashSet;
class Customer extends Object{
	int id;
	String name;
	double balance;
	String city;
//	constructor
	Customer(int id, String name, double balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.city ="delhi";
	}
	@Override
//	upcasting and downcasting
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object instanceof Customer) {
			Customer  c = (Customer) object;
			if(c.id==this.id && c.name.equals(this.name) && c.balance == this.balance) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		if(city.equals("delhi")) {
			return this.name.length() + 100;
		}
		else {
			return this.name.length() + 200;
		}
	}
	@Override
	public String toString() {
		return
		"Customer [id=" + id + ", name=" + name + ", balance=" + balance + "\n]";
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Customer> set = new HashSet<>();
		Customer ram = new Customer(101,"Ram",9999);
//		System.out.println(ram.hashCode());
//		set.add(ram);
		Customer ram1 = new Customer(102,"Ram",10999);
		System.out.println(ram1.hashCode());
		set.add(ram);
		set.add(ram1);
//		System.out.println(set);
		set.add(new Customer(103,"Shyam",29999));
		set.add(new Customer(104,"Shyam",29999));
		set.add(new Customer(103,"Ram",9999));
		set.add(new Customer(103,"Shyam",29999));
		set.add(new Customer(103,"Shyam",29999));
		set.add(new Customer(103,"Shyam",29999));
		set.add(new Customer(103,"Shyam",29999));
		set.add(new Customer(103,"Shyam",29999));
		set.add(new Customer(103,"Shyam",29999));
		System.out.println(set);
		
		
		
//		HashSet<String> set = new HashSet<>();
//		set.add("tim");
//		set.add("ram");
//		set.add("ram");
//		set.add("shyam");
//		set.add("tim");
//		System.out.println(set);

	}

}
