/*
Achieve:使用String toString()方法将字符串生成器中的值,转换为字符串
Time:19:35_Oct29
*/
package Content;

public class String6_32
{
    public static void main(String args[]){
        //构建字符串生成器赋值Hello World
        StringBuilder builder =new StringBuilder("Hello World");
        //将字符串生成器转换为字符串
        String s=builder.toString();
        //输出
        System.out.println("s="+s);
        System.out.println("builder="+builder);
        
    }
}
