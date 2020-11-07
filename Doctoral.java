package 实验3;

public class Doctoral implements StudentM,TeacherM{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	double total;
	public void St(String name, String sex, int age) {
		this.name =name;
		this.sex = sex;
		this.age = age;
	}
	public void setPay(double pay, String name, String sex, int age) {
		this.pay = pay * 12;
		System.out.println("姓名："+name+"\n"+"年龄:"+age+"\n"+"性别："+sex+"\n"+"年收入为：" + this.pay);
	}
	
	public void Pay(double pay) {
		this.pay = pay * 12;
		System.out.println("姓名："+name+"\n"+"年龄:"+age+"\n"+"性别："+sex+"\n"+"年收入为：" + this.pay);
	}
	public void setFee(double fee, String name, String sex, int age) {
		this.fee = fee * 2;
		total = this.pay - this.fee;
		System.out.println("姓名："+name+"\n"+"年龄:"+age+"\n"+"性别："+sex+"\n"+"年收入为：："+pay+"\n"+"年学费为：" + this.fee);
	}
	
	public void Fee(double fee) { 
		this.fee = fee;
		System.out.println("姓名："+name+"\n"+"年龄:"+age+"\n"+"性别："+sex+"\n"+"年收入为：："+pay+"\n"+"学费为：" + this.fee);
	}
	public final void rate() {
		if (total < 30000) {
		    this.total = (this.pay - this.fee) * 0.03;
		    System.out.println("纳税：" + this.total);
		} else if (total > 30000 && total < 120000) {
		    this.total = ((this.pay - this.fee) - 30000) * 0.1 + 30000 * 0.03;
		    System.out.println("纳税：" + this.total);
		} else if (total > 120000 && total < 250000) {
		    this.total = ((this.pay - this.fee) - 120000) * 0.2 + 30000 * 0.03 + 120000 * 0.1;
		    System.out.println("纳税：" + this.total);
		} else if (total > 350000) {
		    this.total = (this.pay - this.fee) *0.3; 
		    System.out.println("纳税：" + this.total);
		}
	}
}