
public class Graduate extends Student implements Staff{

	public Graduate(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("�ҽУ�"+getName()+"�����꣺"+getAge()+"����һ���о�����");
	}

	@Override
	public void Work() {
		// TODO Auto-generated method stub
		System.out.println("����������̵Ĺ�����");
	}

}
