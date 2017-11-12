/*
Achieve:创建StaticTest类，并在该类的主方法中调用静态成员，并在控制台输出。
Time:08:43_Nov01
*/
package Content;

public class StaticTest7_5
{
    //在类中定义静态成员，常量和方法
    static double PI=3.1415926;
    static int id;
    public static void method1(){
        
    }
    //调用静态变量，常量和方法
    public static void method2(){
        System.out.println(StaticTest7_5.PI);
        System.out.println(StaticTest7_5.id);
        StaticTest7_5.method1();
    }
}
