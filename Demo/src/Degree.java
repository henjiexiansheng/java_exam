
public class Degree extends Student implements Staff{

	public Degree(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("我叫："+getName()+"，今年："+getAge()+"，是一名大学生。");
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println("我能完成基础性工作。");
	}
		
}
