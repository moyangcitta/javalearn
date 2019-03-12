                                class Demo02_Override {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
		i.siri();
		i.call();
		Cat c1 = new Cat("white",4);
		System.out.println(c1.getColor() + "..." + c1.getLeg());
		c1.eat();
		c1.catchMouse();

		Dog d1 = new Dog("black",2);
		System.out.println(d1.getColor() + "..." + d1.getLeg());
		c1.eat();
		c1.catchMouse();
	}
}


class Ios7 {
	private String brand;
	private int price;
	
	public Ios7() {}

	public Ios7(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice() {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void call() {
		System.out.println("call someone");
	}

	public void siri() {
		System.out.println("speak English");
	}
}

class Ios8 extends Ios7 {
	public void siri() {
		System.out.println("ÖÐÎÄ");
	}
}

class Animal {
	private String color;
	private int leg;

	public Animal() {}
	
	public Animal(String color,int leg) {
		this.color = color;
		this.leg = leg;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public int getLeg() {
		return leg;
 	}

	public void eat() {
		System.out.println("eat food");
	}
}

class Cat extends Animal {
	public Cat() {}

	public Cat(String color,int leg) {
		super(color,leg);
	}

	public void eat() {
		System.out.println("eat fish");
	}

	public void catchMouse() {
		System.out.println("catch mouse");
	}
}

class Dog extends Animal {
	public Dog() {}

	public Dog(String color,int leg) {
		super(color,leg);
	}

	public void eat() {
		System.out.println("eat meat");
	}

	public void catchMouse() {
		System.out.println("look for thing");
	}
}