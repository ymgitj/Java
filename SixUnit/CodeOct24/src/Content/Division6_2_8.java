/*
实现：根据,和。进行分割，并输出字符串长度和维数
Time:7:16_Oct27
*/
package Content;

public class Division6_2_8
{
    public static void main(String args[]){
        //声明分割的字符串
        String s="where，are，you，from。I，am，from，china。I，am，22，years，old。"+
                 "my，telephone，number，is，13037593287。who，are，you。";
        //输出该字符串
        System.out.println("原来的字符串为\n"+s);
        System.out.println("该字符串的长度为\n"+s.length());
        
        //分割字符串
        String[]  s2=s.split("，|。");
        //输出分割后的字符串
        System.out.println("\n分割后的字符串为");
        for(int i= 0;i<s2.length;i++){
            System.out.print(s2[i]);
        }
        //输出分割后字符串长度
        System.out.println("\n分割后的字符串数组长度为\n"+s2.length);
        
    }
}
