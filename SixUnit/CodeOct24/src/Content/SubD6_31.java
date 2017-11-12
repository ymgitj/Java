/*
Achieve:在主方法中构造一个字符串生成器builder
初始值是StringBuilder,将指定的字符串生成器的子字符串从中删除,将结果输出
Time:19:19_Oct29
*/
package Content;

public class SubD6_31
{
    public static void main(String args[]){
        //构建字符串生成器
        StringBuilder builder=new StringBuilder("StringBuilderd");
        //删除字符串
       StringBuilder s1=builder.delete(5,5);
       //输出删除后的字符串,start=end字符串原样输出
       System.out.println(s1);
       StringBuilder s2=builder.delete(5,10);
       //输出,删除不包括end索引值
       System.out.println(s2);
       
    }
}
