class Demo01_March {
	public static void main(String[] args) {
		Son s1 = new Son();
		System.out.println(s1.getName() + "..." + s1.getAge());
		s1.print();
		System.out.println("----------------------------");
		Son s2 = new Son("lee",23);
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}

class Father extends Object {
	int num1 = 10;
	int num2 = 30;
	private String name;
	private int age;

//	public Father() {
//		System.out.println("Father�Ŀղι��췽��");
//	}

	public Father(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("Father���вι��췽��");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}

class Son extends Father {
	int num2 = 20;

	public void print() {
		System.out.println(this.num1);		//10
		System.out.println(this.num2);		//this	�ͽ�ԭ��	
		System.out.println(super.num2);		//super	�Ӹ���̳�
	}

	public Son() {
		super("bill",24);						//���ʸ����еĿղι���
//		this("kate",21);						//�����еĹ��췽��
		System.out.println("Son�Ŀղι��췽��");
	}

	public Son(String name,int age) {
		super(name,age);
		System.out.println("Son���вι��췽��");
	}
}