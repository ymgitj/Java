package com.eight;

import java.awt.*;
public class GPSCar extends Car implements GPS{
	public Point getLocaton(){
		Point point=new Point();
		point.setLocation(super.getSpeed(),super.getSpeed());
		return point;
	}				
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(super.toString());
		sb.append(",坐标:("+getLocaton().x+","+getLocaton().y+")");
		return sb.toString();
	}
}
