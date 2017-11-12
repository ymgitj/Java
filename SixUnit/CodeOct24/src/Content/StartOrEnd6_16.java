/*
实现：使用startsWith()或者endsWith();判断是否以指定
的字符串结束或开始
*/
package Content;

public class StartOrEnd6_16
{
    public static void main(String args[]){
        //定义字符串num1,num2,num3
        String num1="2658685";
        String num2="54646496";
        
       // 判断字符串num1是否以2开头
       boolean b1=num1.startsWith("2");
       //判断字符串num2是否以6结尾
       boolean b2=num2.endsWith("6");
       //输出结果
       System.out.println("num1为"+num1+" 是否以2开头的"+b1);
       System.out.println("num2为"+num2+" 是否以6结尾的"+b2);
    }
}
