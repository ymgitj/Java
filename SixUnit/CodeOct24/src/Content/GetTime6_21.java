/*
Achieve:在主方法中创建String型变量,实现时间格式的各种转换,并输出结果
Time:10:40_Oct27
*/
package Content;
import java.util.*;
public class GetTime6_21
{
    //
    public static void main(String args[]){
        //创建时间对象
        Date today=new Date();
        System.out.println("默认时间格式"+today);
        System.out.println("2位24小时制的小时"+String.format("%tH",today));
        System.out.println("2位12小时制的小时"+String.format("%tI",today));
        System.out.println("24小时制的小时"+String.format("%tk",today));
        System.out.println("12小时制的小时"+String.format("%tl",today));
        System.out.println("2位小时中的分钟"+String.format("%tM",today));
        System.out.println("2位分钟中的秒"+String.format("%tS",today));
        System.out.println("表示时区缩写形式的字符串"+String.format("%tZ",today));
        System.out.println("上午还是下午"+String.format("%tp",today));
    }
}
