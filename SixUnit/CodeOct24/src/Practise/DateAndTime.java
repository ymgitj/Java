/*
Achieve:将今天的全部信息格式化输出,再将日期以年-月-日的格式输出
Time:17;38_Oct30
*/
package Practise;
import java.util.*;
public class DateAndTime
{
    public static void main(String args[]){
        //创建Date对象
        Date date=new Date();
        System.out.println("输出今天的全部信息\n"+date);
        System.out.println("输出年-月-日格式的信息\n"+String.format("%tF",date));
    }
}
