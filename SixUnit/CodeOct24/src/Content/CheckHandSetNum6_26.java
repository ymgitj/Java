/*
Achieve:在主方法中创建String对象,使用正则表达式对手机号的合法性进行验证
Time:16:17_Oct28
*/

package Content;

public class CheckHandSetNum6_26
{
    public static void main(String args[]){
        //定义验证的手机号码
        String telephone1="13037593287";
        String telephone2="6464976";
        System.out.println(check(telephone1));
        System.out.println(check(telephone2));
    }
    public static String check(String s){
        
        //定义正则表达式
        String regex="1[3,5,8]\\d{9}$";
        if(s.matches(regex))
            //输出
            return s+"是一个合法的手机号";
        else
        return s+"不是一个合法的手机号";
    }
}
