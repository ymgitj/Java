/*
Achieve:创建StringB类,使用reverse()方法把字符串反转,
然后比较两个字符串相同位置的字符串是否相同,如果都相同则为回文
Time:15:40_Oct30
*/
package Content;

public class StringB6_6_2
{
    public static void main(String args[]){
        //创建一个字符串
        String s="贺聪注意安全贺聪";
        //创建字符串构造器并反转字符串
        StringBuilder builder=new StringBuilder(s);
        //反转
        builder.reverse();
        //定义蛮变量count
        int count=0;
        //使用for循环进行两相同索引 位置值的比较
        for(int i=0;i<s.length();i++){
            //判断是否是回文
            if(s.charAt(i)!=builder.charAt(i)){
                //输出判断
                System.out.println(s+"不是回文");
                break;
            }
            if(s.charAt(i)==builder.charAt(i)){
                count++;
            }
        }
        if(count==s.length()){
            System.out.println(s+" 是回文");
        }
    }
}
