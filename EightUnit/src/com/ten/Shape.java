package com.ten;
//创建一个抽象类
public abstract class Shape{
	public String getName(){
		return this.getClass().getSimpleName();
	}
	public abstract double getArea();//获得图形的面积
}
