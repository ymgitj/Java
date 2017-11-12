/*
实现：trim()
去除字符串前导,尾部空格
*/
package Content;

public class Blak6_10
{
    public static void main(String args[]){
        //声明字符串s1中间有几个空格
        String s1="     hello word      ";
        //去除空格
        String s2=s1.trim();
        //输出原来的字符串
        System.out.println("原来的字符串是"+s1+"长度是"+s1.length());
        //输出去除空格的字符串
        System.out.println("去除空格后的字符串是"+s2+"长度是"+s2.length());
    }
}
