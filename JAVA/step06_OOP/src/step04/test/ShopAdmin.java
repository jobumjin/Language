package step04.test;

public class ShopAdmin {
	
	static Person[] publicData() {
		Person[] o = {new Customer("백종원", 30, "gold"), 
					  new Employee("유재석", 20, "인사부")};
		return o;
	}
	
	public static void print(Person[] o) {
		Customer c = (Customer)o[0];
		System.out.println(c.getGrade());
	}
	
	public static void main(String[] args) {
		print(publicData());
	}

}

