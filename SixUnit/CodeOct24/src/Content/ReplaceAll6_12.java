/*
实现：使用replaceAll()方法去除字符串中所有空格
*/
package Content;

public class ReplaceAll6_12
{
    public static void main(String args[]){
        //声明带有空格的字符串
        String s="good morning hello nice word";
        //输出原来的字符串
        System.out.println("原来的字符串为：\n"+s);
        //使用repalceAll()方法去除空格赋值给新字符串
        String s2=s.replaceAll(" ","");
        //输出去除空格后的字符串
        System.out.println("去除空格后的字符串\n"+s2);
        
    }
}
