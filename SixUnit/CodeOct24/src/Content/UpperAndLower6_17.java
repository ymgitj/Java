/*
实现；使用toLowerCase(),toUpperCase()进行大小写转换
18.07_Oct26
*/
package Content;

public class UpperAndLower6_17
{
    public static void main(String args[]){
        //声明要转换大小写的字符串
        String s1="qwertyuiop";
        String s2="ASDFGHJKL";
        //进行大写转换
        System.out.println(s1+"转换大写为\n"+(s1.toUpperCase()));
        //再转换为小写
        System.out.println(s2+"转换为小写为\n"+(s2.toLowerCase()));
    }
}
