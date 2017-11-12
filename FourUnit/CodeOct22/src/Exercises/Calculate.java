/*
实现：计算1+1/2!+1/3!+1/4!+......+1/20!的和
*/
package Exercises;

public class Calculate
{
    public static void main(String args[]){
        Calculate(20);
    }
    public static void Calculate(int n){
        //定义和为suma为每一项算式
        double sum=0,a=1;
        int b=1;
        //b改变循环条件
        while(b<n){
            //求和
            sum=sum+a;
               b++;
                a*=1/b;
        }
        //输出和
        System.out.println(sum);
    }
}
