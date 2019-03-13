class Demo03_Polymorphic {						//polymorphic		��̬
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

	public static void method(Animal a) {		//��������ʱ��չ��ǿ;
		//�ؼ���	instanseof	�ж�ǰ�ߵ������Ƿ��Ǻ�ߵ���������
		if (a instanceof Cat) {
			Cat c = (Cat)a;							//ǿתʱ���ܻ�������ת���쳣��ClasscaseException
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
		System.out.println("����Է�");
	}

	public static void method() {
		System.out.println("���ﾲֹ");
	}
}

class Cat extends Animal {
	int num = 20;

	public void eat() {
		System.out.println("è����");
	}

	public static void method() {
		System.out.println("è��ֹ");
	}

	public void catchMouse() {
		System.out.println("catchmouse");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}

	public static void method() {
		System.out.println("����ֹ");
	}

	public void lookHome() {
		System.out.println("lookhome");
	}
}
