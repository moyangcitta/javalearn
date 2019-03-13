class Demo03_Polymorphic {						//polymorphic		多态
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();			
		a.eat();
		System.out.println(a.num);
		a.method();								//Animal.method()
		method(new Cat());
		method(new Dog());
	}

	public static void method(Animal a) {		//当作参数时拓展性强;
		//关键字	instanseof	判断前边的引用是否是后边的数据类型
		if (a instanceof Cat) {
			Cat c = (Cat)a;							//强转时可能会有类型转换异常，ClasscaseException
			c.catchMouse();
			c.eat();
		}else if (a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
			d.lookHome();
		}else {
			a.eat();
		}
	}
}

class Animal {
	int num = 10;

	public void eat() {
		System.out.println("动物吃饭");
	}

	public static void method() {
		System.out.println("动物静止");
	}
}

class Cat extends Animal {
	int num = 20;

	public void eat() {
		System.out.println("猫吃鱼");
	}

	public static void method() {
		System.out.println("猫静止");
	}

	public void catchMouse() {
		System.out.println("catchmouse");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}

	public static void method() {
		System.out.println("狗静止");
	}

	public void lookHome() {
		System.out.println("lookhome");
	}
}
