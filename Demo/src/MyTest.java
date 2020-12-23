import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Small("张三",23));
		stu.add(new Middle("李四",22));
		stu.add(new Degree("王五",24));
		stu.add(new Graduate("田六",25));
		stu.add(new Degree("李静",22));
		while(true) {
			try {
				System.out.println("1-新增 2-修改 3-删除 4-查看 5-介绍 6-工作 0-退出");
				System.out.println("请输入功能选项");
				String count = sc.next();
				Integer count1 = new Integer(count);
				if(count1<0 || count1>6) {
					System.out.println("数值有误，重新输入：");
					continue;
				}
				switch(count1) {
					case 0:{
						System.out.println("程序即将退出：");
						System.exit(-1);
					}
					case 1:{
						int m;
						while(true) {
							System.out.println("请输入新增人员位置：");
							m = sc.nextInt();
							if(m<1 || m>stu.size()) {
								System.out.println("数值有误，重新输入：");
								continue;
							}
							break;
						}
						System.out.println("请输入新增人员姓名：");
						String name = sc.next();
						System.out.println("请输入新增人员年龄：");
						int age = sc.nextInt();
						int k;
						while(true) {
							System.out.println("1-小学生 2-中学生 3-大学生 4-研究生");
							System.out.println("请输入新增人员学历：");
							k = sc.nextInt();
							if(k<1 || k>4) {
								System.out.println("数值有误，重新输入：");
								continue;
							}
							break;
						}
						if(k == 1) {
							stu.add(m-1,new Small(name,age));
						}
						else if(k == 2) {
							stu.add(m-1,new Middle(name,age));
						}
						else if(k == 3) {
							stu.add(m-1,new Degree(name,age));
						}
						else if(k == 4) {
							stu.add(m-1,new Graduate(name,age));
						}
						System.out.println("人员新增成功。");
						break;
					}
					case 2:{
						int m;
						while(true) {
							System.out.println("请输入修改人员位置：");
							m = sc.nextInt();
							if(m<1 || m>stu.size()) {
								System.out.println("数值有误，重新输入：");
								continue;
							}
							break;
						}
						System.out.println("请输入修改人员姓名：");
						String name = sc.next();
						System.out.println("请输入修改人员年龄：");
						int age = sc.nextInt();
						int k;
						while(true) {
							System.out.println("1-小学生 2-中学生 3-大学生 4-研究生");
							System.out.println("请输入修改人员学历：");
							k = sc.nextInt();
							if(k<1 || k>4) {
								System.out.println("数值有误，重新输入：");
								continue;
							}
							break;
						}
						if(k == 1) {
							stu.set(m-1,new Small(name,age));
						}
						else if(k == 2) {
							stu.set(m-1,new Middle(name,age));
						}
						else if(k == 3) {
							stu.set(m-1,new Degree(name,age));
						}
						else if(k == 4) {
							stu.set(m-1,new Graduate(name,age));
						}
						System.out.println("人员更新成功。");
						break;
					}
					case 3:{
						int m;
						while(true) {
							System.out.println("请输入删除人员位置：");
							m = sc.nextInt();
							if(m<1 || m>stu.size()) {
								System.out.println("数值有误，重新输入：");
								continue;
							}
							break;
						}
						stu.remove(m-1);
						System.out.println("人员删除成功。");
						break;
					}
					case 4:{
						for(int i=0;i<stu.size();i++) {
							System.out.println("姓名："+stu.get(i).getName()+"，年龄："+stu.get(i).getAge());
						}
						break;
					}
					case 5:{
						for(int i=0;i<stu.size();i++) {
							stu.get(i).show();
						}
						break;
					}
					case 6:{
						int m;
						while(true) {
							System.out.println("请输入查询人员位置：");
							m = sc.nextInt();
							if(m<1 || m>stu.size()) {
								System.out.println("数值有误，重新输入：");
								continue;
							}
							break;
						}
						if(stu.get(m-1) instanceof Staff) {
							((Staff)stu.get(m-1)).Work();
						}
						else {
							System.out.println("暂不能工作。");
						}
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("数值有误，重新输入：");
			}
		}

	}

}
