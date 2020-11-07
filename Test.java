package 实验3;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		int flag = 1;
		Doctoral S1 = new Doctoral(); 
		Doctoral S2 = new Doctoral();
		System.out.println("请输入第一个研究生的姓名，性别，年龄：");
		Scanner input = new Scanner(System.in);
		String name1 = input.nextLine();
		String sex1 = input.nextLine();
		int age1 = input.nextInt();
		S1.St(name1, sex1, age1);
		Scanner input1 = new Scanner(System.in);
		System.out.println("请输入第二个研究生的姓名，性别，年龄：");
		String name2 = input1.nextLine();
		String sex2 = input1.nextLine();
		int age2 = input1.nextInt(); 
		S1.St(name2, sex2, age2);
		while(flag==1) { 
			try {
				Scanner input2 = new Scanner(System.in);
				System.out.println("请输入"+name1+"的月薪水");
				double wmonth_1 = input2.nextDouble();
				S1.setPay(wmonth_1,name1,sex1,age1);
				System.out.println("请输入"+name1+"的每学期学费");
				double wseason_1 = input2.nextDouble();
				S1.setFee(wseason_1,name1,sex1,age1);
				S1.rate();
				System.out.println("请输入"+name2+"的月薪水");
				double wmonth_2 = input.nextDouble();
				S2.setPay(wmonth_2,name2,sex2,age2);
				System.out.println("请输入"+name2+"的每学期学费");
				double wseason_2 = input.nextDouble();
				S2.setFee(wseason_2,name2,sex2,age2);
				S2.rate();
				input.close();
				break;
			}catch(Exception wmonth_1) {
				System.out.println("输入有误");
			}
		}
	}
}
