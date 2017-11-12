/*
Achieve:
1,StringBuilder append(String str)方法将字符串追加到字符串生成器中
2,stringBuilder append(StringBuffer sb)方法将字符串缓存中的值追加到字符串生成器中
Time:11:26_Oct29
*/
package Content;

public class And6_28And6_29
{
    public static void main(String args[]){
        //定义String 型字符串
        String str="Hello World";
        //创建StringBuilder对象
        StringBuilder builder=new StringBuilder();
        builder.append(str);
        //输出追加的字符串
        System.out.println("builder的值为："+builder);
        //创建StringBuffer对象
        StringBuffer sb=new StringBuffer("World Hello");
        //把StringBuffer中的值追加到字符串生成器中
        builder.append(sb);
        //输出追加后的值
        System.out.println(builder);
        
        
    }
}
