
public class Middle extends Student{

	public Middle(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("我叫："+getName()+"，今年："+getAge()+"，是一名中学生。");
	}
	
}
