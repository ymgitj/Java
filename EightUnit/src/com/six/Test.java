package com.six;
import java.util.Date;
public class Test {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("java");
		employee.setSalary(100);
		employee.setBirthday(new Date());
		Manager manager=new Manager();
		manager.setName("你好");
		manager.setSalary(33);
		manager.setBirthday(new Date());
		manager.setBonus(3200);
		//输出经理和员工的属性值
	 	System.out.println("员工的姓名:"+employee.getName());
		System.out.println("员工的工资:"+employee.getSalary());
		System.out.println("员工的生日:"+employee.getBirthday());
		System.out.println("经理的姓名:"+manager.getName());
		System.out.println("经理的工资:"+manager.getSalary());
		System.out.println("经理的生日:"+manager.getBirthday());
		System.out.println("经理的资金:"+manager.getBonus());
	}	
}
