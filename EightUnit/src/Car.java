public class Car {
	//汽车的名字
	private String name;
	//汽车的速度
	private double speed;
	public double getSpeed(){
         return this;
	}
	public double setLocation(double speed,double speed){
		return this.speed=speed;
	
	}


	//重写toString()方法
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("车名 "+name+",");
		sb.append("速度 "+speed+"千米每小时");
		return sb.toString();
	}


	
}
