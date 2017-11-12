/*
Achieve:在主方法中构造一个字符串生成器builder初始值是字符
串s1的值int,将字符串s2的值ser追加到字符串生成器索引位置2处,并将builder输出
Time:11:48_Oct29
*/
package Content;

public class SubO6_30
{
    public static void main(String args[]){
        //创建字符串对象
        String s1="int";
        String s2="ser";
        //构造初始值为int 的字符串生成器
        StringBuilder builder=new StringBuilder(s1);
        //向索引值为2处添加字符串ser
        builder.insert(2,s2);
        //输出builder
        System.out.println("向"+s1+"索引值为2处添加字符ser后的字符串为："+builder);
    }
}
