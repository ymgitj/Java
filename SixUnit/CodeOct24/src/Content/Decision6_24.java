/*
Achieve:判断指定字符串是否合法,要求字符串由7个字符组成,并且第一位必需是大写.
字母,2～4位必须是小写字母,后三位必须是数字字符,并输出结果。
Time:11:51_Oct27
*/
package Content;

public class Decision6_24
{
    public static void main(String args[]){
        //需要判断的字符串
        String s1="Mrkj007";
        String s2="Mrkj007";
        //判断字符串变量s的值是否合法
       // boolean b1=s1.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
        boolean b1=s1.matches("\\p{Upper}\\P{Lower}{3}\\d{3}");
        boolean b2=s2.matches("\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d");
        //输出 
        System.out.println(s1+"是合法的数据吗"+b1);
        System.out.println(s2+"是合法的数据吗"+b2);
    }    
}
///problem
