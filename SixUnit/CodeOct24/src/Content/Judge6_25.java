/*
Achieve:在主方法中创建String 对象实现使用正则表达式来判断
指定的变量是否是合法的Email地址
Time:15:44_Oct28
*/
package Content;

public class Judge6_25
{
    public static void main(String args[]){
        //正则表达式定义邮箱格式
        String regex="\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";
        String s1="aaa@7cmm";
        String s2="aaa";
        String s3="aaa@111.com";
        //判断匹配
        if(s1.matches(regex)){
            //输出
            System.out.println(s1+"是一个符合的邮箱");
        }
         if(s2.matches(regex)){
            System.out.println(s2+"是一个符合的邮箱");
        }
        if(s3.matches(regex)){
            System.out.println(s3+"是一个符合的邮箱");
        }
        else{
            System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+"都不是符合的邮箱地址");
        }
    }
}
