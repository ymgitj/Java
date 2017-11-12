/*
Achieve:在主方法中创建String型变量,将时间和日期格式化并输出
Time:11:35_Oct27
*/
package Content;
import java.util.*;
public class DateAndTime6_22
{
    public static void main(String args[]){
        //创建时间对象
        Date date=new Date();
        //输出
        System.out.println("默认的日期时间格式"+date);
        System.out.println("24小时制的时间,被格式化为小时和分钟"+String.format("%tR",date));
        System.out.println("24小时制的时间,被格式化为小时,分钟和秒"+String.format("%tT",date));
        System.out.println("12小时制的时间,被格式化为："+String.format("%tR",date));
        System.out.println("日期被格式化为："+String.format("%tD",date));
        System.out.println("日期和时间,被格式化为："+String.format("%tR",date));
        System.out.println("ISO 8601格式的完整日期,被格式化："+String.format("%tF",date));
    }
}
