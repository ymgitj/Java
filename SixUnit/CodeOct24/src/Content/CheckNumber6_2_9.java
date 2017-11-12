/*
实现：验证124534676是否为数字格式
Time:7:18Oct27
*/
package Content;

public class CheckNumber6_2_9
{
    public static void main(String args[]){
        //定义字符串
        String s="124534676";
        //输出字符串s
        System.out.println("字符串s为："+s);
        //检测该字符串是否是数字 
        if(CheckNumber6_2_9.IsNumber(s)){
            System.out.println("字符串s是数字格式");
            
        }
        else
            System.out.println("字符串s不是数字格式");
    }
    public static boolean IsNumber(String s){
        //将字符串拆分并赋值给字符数组
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                
            }                            
            else return false;
        }
         return true;
    }
}
