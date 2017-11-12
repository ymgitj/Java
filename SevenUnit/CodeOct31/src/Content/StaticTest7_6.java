/*
Achieve:该类中主方法调用静态成员，并在控制台上输出
Time:12:21_Nov03
*/
package Content;

public class StaticTest7_6
{
    //定义静态成员，
    static double PI=3.1415926f;
    static int id;
    //静态方法
    public static void method1(){
        //方法体
       
    }
    public void method2(){
        //调用静态常量，变量，方法
        System.out.println(StaticTest7_6.PI);
        System.out.println(StaticTest7_6.id);
        StaticTest7_6.method1();
    }
    public static StaticTest7_6 method3(){
        //调用非静态方法
        //静态方法体中不能使用非静态方法和this关键字
       // method2();
        
       // return this;
       return method3();
    }
}
