/*要求：
    定义两个int 型变量使用条件运算符判断是否相等
    若不相等求得最大的值
    */
public class Test2
{
    public static void main(String args[])
    {
        int a=20,b=30;
        int max;
        max=(a>b)?a:b;
        System.out.println("输出最大值为:"+max);
    }
}
