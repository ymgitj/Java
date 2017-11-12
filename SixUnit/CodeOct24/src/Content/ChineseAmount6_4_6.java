/*
Achieve:计算文章中文字的个数
Time:06:12_Oct29
*/
package Content;
import java.util.regex.Pattern;

public class ChineseAmount6_4_6
{
    public static void main (String args[]){
        //定义计算个数的字符串
        String text="河南省人民医院  哦呵呵";
        //
        System.out.println(count(text));
    }
    public static String count(String s){
        //声明累加器
        int amount=0;
        //定义正则表达式
        for(int i=0;i<s.length();i++){
            boolean match=Pattern.matches("^[\u4E00-\u9FA5]{0,}$",""+s.charAt(i));
        
            if(match){
                amount++;
            }
        }
        return s+"......中有"+amount+"个汉字";
    }
}
