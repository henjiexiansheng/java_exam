
public class Graduate extends Student implements Staff{

	public Graduate(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("我叫："+getName()+"，今年："+getAge()+"，是一名研究生。");
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println("我能完成助教的工作。");
	}

}
