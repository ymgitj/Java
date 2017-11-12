/*
Achieve:在主方法中创建String型变量,实现不同类型字符串的转换
Time:17:50_Oct27
*/
package Content;

public class General6_23
{
    public static void main(String args[]){
        //将结果以十进制显示
        String st1=String.format("%d",400/2);
        //将结果以布尔形式显示 
        String st2=String.format("%b",3>6);
        //将结果以十六进制格式显示
        String st3=String.format("%x",200);
        //输出 格式化字符串
        System.out.println("400的一半是"+st1);
        System.out.println("3>6为"+st2);
        System.out.println("200的十六进制为"+st3);
        
    }
}
