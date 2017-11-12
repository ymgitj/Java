/*
实现：replaceFirst()
*/
package Content;

public class ReplaceFirst6_14
{public static void main(String args[]){
    //定义替换字符串
    String s1=" bad bad good";
    //输出替换前的字符串
    System.out.println("替换前的字符串为：\n"+s1);
    //将s1中的第一个bad替换o为good
    String s2=s1.replaceFirst("bad","good");
    //输出替换后的字符串
    System.out.println("替换后的字符串为：\n"+s2);
}
}
