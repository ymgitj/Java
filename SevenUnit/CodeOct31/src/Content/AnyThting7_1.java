/*
Achieve:该类中使用this关键字调用构造方法
Time:19:23_Oct31
*/
package Content;

public class AnyThting7_1
{
    //定义无参构造方法
    public AnyThting7_1(){
        //在无参构造方法中可以调用有参构造方法
        //但只能在无参构造方法的第一句使用this关键字调用有参构造方法
        this("this调用有参构造方法");
        System.out.println("无参构造方法");
    }
    //使用this关键字调用有参构造方法
    public AnyThting7_1(String name){
        System.out.println("有参构造方法");
        
    }
    public static void main(String args[]){
        //
       
    }
}
