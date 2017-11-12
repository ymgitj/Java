/*
实现:利用format方法格式化today对象
Time:09:29_Oct27
*/
package Content;

import java.util.Date;
import java.util.Locale;

public class DateToday6_20
{
    public static void main(String args[]){
        //创建日期对象
        Date today=new Date();
        //格式化月份的英文缩写
        String a=String.format(Locale.US,"%tb",today);
        //格式化月份的英文全写
        String b=String.format(Locale.US,"%tB",today);
        //格式化星期简称       
        String c=String.format("%ta",today);
        //格式化星期全称
        String d=String.format("%tA",today);
        //格式化4位的年份值
        String e=String.format("%tY",today);
        //格式化2位的年份值
        String f=String.format("%ty",today);
        //格式化为两位的月份值
        String g=String.format("%tm",today);
        //格式化两位的日期值
        String h=String.format("%td",today);
        //格式化一位的日期值
        String i=String.format("%te",today);
        System.out.println("格式化后的字符串为月份英文缩写"+a);
        System.out.println("格式化后的字符串为月份英文全写"+b);
        System.out.println("月格式化后的字符串为星期"+c);
        System.out.println("格式化后的字符串为星期"+d);
        System.out.println("格式化后的字符串为4位的年份值"+e);
        System.out.println("格式化后的字符串为2位的年份值"+f);
        System.out.println("格式化后的字符串为2位的月期值"+g);
        System.out.println("格式化后的字符串为2位的日期值"+h);
        System.out.println("格式化后的字符串为1位的日期值"+i);
    }
}
