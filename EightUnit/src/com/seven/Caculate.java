package com.seven;
public class Caculate {
	final float PI=3.1415926f;
	//求取回的面积
	public float getArea(float r){
		float area=r*r*PI;
		return area;
	}

	//求取矩形的面积
	public float getArea(float w,float l){
		 float area=w*l;
		 return area;
	}
	//画任意形状的图形
	public void draw(int num){
		System.out.println("画"+num+"个任意形状的图形");
	}
	//画指定形状的图形
	public void draw(String shape){
		System.out.println("画一个"+shape);
	}
	public static void main(String[] args) {
		Caculate caculate=new Caculate();
		float l=20;
		float w=30;
		float areaRectangle=caculate.getArea(l,w);
		System.out.println("求长为"+l+"宽为"+w+"的矩形的面积是:"+areaRectangle);
		float r=7;
		float areaCirc=caculate.getArea(r);
		System.out.println("求半径为"+r+"的圆的面积是:"+areaCirc);
		int num=93;
		caculate.draw(num);
		caculate.draw("三角形");
	}
	
}
