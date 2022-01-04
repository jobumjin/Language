package step03;

public class CarTest {
	public static void main(String[] args) {
	
		Car c1 = new Car();
		c1.setModel("Sonata");
		c1.setColor("red");
		c1.setTire("금호타이어");
		c1.setBrand("현대");
		c1.setYear(10);
		c1.setSpeed(200);
		c1.setGear(6);
	
		Car c2 = new Car();
		c2.setModel("Avante");
		c2.setColor("white");
		c2.setTire("넥센타이어");
		c2.setBrand("현대");
		c2.setYear(5);
		c2.setSpeed(180);
		c2.setGear(5);
	
		c1.print();
		c2.print();
	
	}
}
