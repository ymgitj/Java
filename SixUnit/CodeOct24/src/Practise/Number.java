/*
Achieve:创建Number类判断字符串"mingrikejijavabu"中字符i出现的次数并将结果输出
Time:16:08_Oct30
*/
package Practise;

public class Number
{
    public static void main(String args[]){
        //定义字符串数组
        String s1="mingrikejijavabu";
        //定义计数变量
        int count1=0,count2=0;
        //创建构造器
        //First方法利用byte[]数组
        byte[] bt=s1.getBytes();
        for(int i=0;i<s1.length();i++){
            if(bt[i]=='i'){
                count1++;
            }

        }
        //Two方法利用StringBuilder
        StringBuilder builder=new StringBuilder(s1);
        //for循环遍历builder
        for(int i=0;i<builder.length();i++){
            if(builder.charAt(i)=='i'){
                count2++;
            }

        }
        //输出'i'出现的次数
        System.out.println("字符i出现的次数为："+count1+"....."+count2);
    }
}
