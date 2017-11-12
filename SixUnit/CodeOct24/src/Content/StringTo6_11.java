/*
实现：StringTokenizer()去除字符串中所有空格并将其输出
*/
package Content;
import java.util.StringTokenizer;

public class StringTo6_11
{
    public static void main(String args[]){
        //定义包涵空格的字符串
        String s=" hello word Good morning";
        System.out.println("去掉空格前的字符串");
        System.out.println(s);
        //使用空格分割字符串
        StringTokenizer st=new StringTokenizer(s," ");
        //定义字符串缓存对象
        StringBuffer sb=new StringBuffer();
        int i=1;
        //判断字符串中是否还有空格
        while(st.hasMoreTokens()){
            i++;
            //向字符串生成器中添加内容
            sb.append(st.nextToken());
        }
        System.out.println("去掉空格后的字符串");
        System.out.println(sb.toString());
   }
    
}
