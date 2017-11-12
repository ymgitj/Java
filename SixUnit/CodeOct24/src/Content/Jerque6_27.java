/*
Achiveve:通过实例对比String和SringBuilder在字符串中作更新操作时所用时间的差别
Time:06:37_Oct29
*/
package Content;

public class Jerque6_27
{
    public static void main(String args[]){
        //创建空字符串
        String s1="";
        //定义执行操作的起始时间
        long startTime=System.currentTimeMillis();
        //for循环执行1000000次操作
        for(int i=0;i<10000;i++){
            //循环追加字符串
            s1=s1+i;
        }
        //定义对字符串操作后的时间
        long endTime=System.currentTimeMillis();
        //计算执行操作后时间
        long time=endTime-startTime;
        //输出执行操作的时间
        System.out.println("String所用的时间为："+time);
        //创建字符串生成器
        StringBuilder sb=new StringBuilder("");
        //执行操作前的时间
        startTime=System.currentTimeMillis();
        //for循环都进行操作
        for(int i=0;i<10000;i++){
            sb.append(i);
        }
        //执行后的时间
        endTime=System.currentTimeMillis();
        //追加执行操作后time
        time=endTime-startTime;
        //输出StringBuilder操作的时间
        System.out.println("StringBuilder所用的时间为："+time);
    }
}
