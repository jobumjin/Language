package step03;

public class CarTest {
	public static void main(String[] args) {
	
		Car c1 = new Car();
		c1.setModel("Sonata");
		c1.setColor("red");
		c1.setTire("��ȣŸ�̾�");
		c1.setBrand("����");
		c1.setYear(10);
		c1.setSpeed(200);
		c1.setGear(6);
	
		Car c2 = new Car();
		c2.setModel("Avante");
		c2.setColor("white");
		c2.setTire("�ؼ�Ÿ�̾�");
		c2.setBrand("����");
		c2.setYear(5);
		c2.setSpeed(180);
		c2.setGear(5);
	
		c1.print();
		c2.print();
	
	}
}
