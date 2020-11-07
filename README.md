# JAVA-experiment4
# 计191 王博涛 2019310193
# 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
# 实验目的
掌握Java中抽象类和抽象方法的定义；  
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  
了解异常的使用方法，并在程序中根据输入情况做异常处理  
# 实验要求
1.在博士研究生类中实现各个接口定义的抽象方法;  
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5.根据输入情况，要在程序中做异常处理。  
# 实验过程
## （1）设计两个管理接口：
`学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。`
>   首先以interface来声明一个接口`public interface StudentM {`，这样其他类就可以通过继承接口的方式，从而来继承接口的抽象方法。  
 学生管理接口中应有两个抽象方法，抽象方法用来描述系统具有什么功能，但不提供具体的实现。例如：`public abstract void setFee(double fee);`为查询学费的抽象方法。教师接口同上：  
 ```
    public interface TeacherM {
	    public abstract void setPay(double pay,double pay,String name, String sex, int age);
	    public abstract void Pay(double pay);
    }
 ```
## （2）设计博士研究生类
`实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）`
>   首先`public class Doctoral implements StudentM,TeacherM{`使用implements关键字可以同时继承多个接口，实现接口中的所有方法。随后是声明几个必须的变量：姓名、性别、年龄、每学期学费、   每月薪水。  
 其次，要编写交互输入，要有一个方法来记录用户输入的学生信息：
 ```
      public void St(String name, String sex, int age) {
		  this.name =name;
		  this.sex = sex;
		  this.age = age;
	  }
 ```
>然后就是实现学生管理接口和教师接口中的抽象方法，因为用户输入的是月薪水和每学期学费，所以我在方法中把月薪水乘以12，每学期学费乘以2，就是年薪水和年学费。在方法中打印这个研究生当前的信息以及年薪水年学费。另外`total = this.pay - this.fee;`用来求得纳税额。  
 以final声明一个方法rate()`public final void rate() {`根据2020年国家最新纳税标准编写计算税收。rate()无法被子类重写，但该方法仍然可以被继承。
## （3）编写测试类 
`并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。`
>首先实例化两个研究生，S1和S2，`Doctoral S1 = new Doctoral();`用户输入的两名研究生信息使用方法`S1.St(name1, sex1, age1);`进行储存。  
 调用`S1.setPay(wmonth_1,name1,sex1,age1);`方法，根据用户输入的信息进行计算并打印出研究生信息。在输入学期学费并调用方法打印后，继续调用`S1.rate();`计算税收。  
 两个研究生根据先后顺序依次执行。
## 异常处理
>如果在输入薪水和学费时，输入英文字母或其他字符会报错停止运行，因为薪水和学费声明为了double。那么异常处理就要发现这个错误，并且提示用户输入错误，然后重新输入。  
  ```
  try {
  }catch(Exception wmonth_1) {
	System.out.println("输入有误");
}
  ```
  >这样就可以检测错误，如果要实现重新输入这个形式，我选择在try语句前面加上一个永真循环，并在try{}中最后加上`break;`。当异常处理结束后还会继续执行循环，如果没有出错，则会break跳出循环，结束程序。
# 流程图
![实验结果截图](https://github.com/plachta2/JAVA-experiment4/raw/main/流程图2.png)
# 核心代码
```
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
```
以上是实现每个研究生的税收计算的代码，包括完整的异常处理。
# 实验结果
![实验结果截图](https://github.com/plachta2/JAVA-experiment4/raw/main/实验结果.png)
# 实验感想
这次实验主要是体会了接口的声明和抽象方法的实现，以及异常处理的编写。使用 implements 关键字可以使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口。一个接口可以有多个方法。同时我还明白了接口不能用于实例化对象，并且接口不是被类继承了，而是要被类实现。  
用abstract修饰的方法表示抽象方法,抽象方法没有方法体，抽象方法只能用来描述功能，但不能自己实现。  
异常处理部分的编写还算顺利，在catch()的括号中用正确的错误检测。Exception是程序正常运行中，可以预料的意外情况。本程序中可出现的错误为用户输入月薪水和每学期学费时输入的变量类型错误，本应是double，用户输入了String，则会出现错误。这时使用异常处理则可以避免直接结束程序，可以继续进行。在try{}外面加上一层永真循环就可以解决。
最后也对final有了更新的认识：当使用final修饰方法时，这个方法将成为最终方法，无法被子类重写。但是，该方法仍然可以被继承。
