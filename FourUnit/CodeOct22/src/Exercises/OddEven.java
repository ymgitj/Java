/*
实现：判断输入x的奇偶性
*/
package Exercises;
import java.util.*;
public class OddEven
{
    public static void main(String args[]){
        //建立扫描器
        Scanner s=new Scanner(System.in);
        //提示输入
        System.out.println("请输入一个整数");
        //接收输入
        int num=s.nextInt();
        if(num%2==0){        //判断奇偶性
            //输出为奇数
            System.out.println(num+" is Odd");
        }
        else
            //输出为偶数
            System.out.println(num+" is Even");
    }
}
