package step03;

public class Car {
	String model;
	String color;
	String brand;
	String tire;
	int year;
	int speed;
	int gear;
	
	public Car() {}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTire() {
		return tire;
	}

	public void setTire(String tire) {
		this.tire = tire;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	void print() {    
        System.out.println("(" + model + ", " + color + ", "  +  brand + ", " + tire + ", "+ year + ", " + speed + ", " + gear + ")");
    }

	
	
}
