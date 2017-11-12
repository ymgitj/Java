
public class Gess
{
    public static void main(String[] args)
    {
        char char1='\\'; /*将转义字符'\\'赋值给char1*/
        char char2='\u2605'; /*将转义字符"\u2405"赋值给char2*/
        int i=10;          /*定义整型变量i并赋值为10  */
        System.out.println("i="+i);
        i=100;             /*重新赋值为100*/
        System.out.println("i="+i);
        System.out.println("char1为:"+char1);
        System.out.println("char2为:"+char2);
    }
}
