package com.eight;

public class Car {
    private String name;
    private double speed;

    public String getNmae(){
	return name;
    }

    public void setName(String name){
	this.name=name;
    }

    public double getSpeed(){
	return speed;
    }

    public void setSpeed(double speed){
	this.speed=speed;
    }

    public String toString(){
	StringBuilder sb=new StringBuilder();
	sb.append("车名"+name+",");
	sb.append("车速"+speed+",");
	return sb.toString();
    }

}
