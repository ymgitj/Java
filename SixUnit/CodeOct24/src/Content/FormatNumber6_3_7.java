/*
Achieve:使用format()方法将数字格式化成不同国家或地区的货币格式
Time:09:03_Oct28
*/
package Content;
import java.util.*;
import java.text.NumberFormat;
public class FormatNumber6_3_7
{
    public static void main(String args[]){
        //创建扫描器
        Scanner scan=new Scanner(System.in);
        //请输入一个数字
        System.out.println("请输入一个数字");
        //接收输入
        Double number=scan.nextDouble();
        //
        System.out.println("Locale类的常量作为参数获得不同的货币格式");
        //创建格式化对象
        NumberFormat format=NumberFormat.getCurrencyInstance(Locale.CHINA);
        //输出格式化的货币
        System.out.println("Locale.CHINA....."+format.format(number));
        format=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Locale.Us....."+format.format(number));
        format=NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println("Locale.ENGLISH....."+format.format(number));
        format=NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        System.out.println("Locale.TAIWAN....."+format.format(number));
        
        
        
    }
}
