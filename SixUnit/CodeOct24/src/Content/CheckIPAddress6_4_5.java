/*
Achieve:判断IP地址的合法性
Time:16:30_Oct28
*/
package Content;

public class CheckIPAddress6_4_5
{
    public static void main(String args[]){
        //定义判断的IP地址
        String IP="192.168.1.1";
        //matches方法判定  输出
        System.out.println(matches(IP));
        
    }
    public static String matches(String s){
        if(s!=null&&!s.isEmpty()){
        //定义正则表达式
        String regex="^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
                     +"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                     +"(1\\d{2}|2[0-4]\\d|26[0-5]|[1-9]\\d|\\d)\\."
                     +"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
        
           if(s.matches(regex)){
               return s+"是一个合法的IP地址";
           }
           else{
                return s+"不是一个合法的IP地址";
           }
        }
        return "请输出要验证的IP地址";
        
    }
 
}
