/*
Achieve:将小写金额转换为大写金额
Time:18:04Oct27
*/
/*package Content;
import java.util.*;
import java.text.DecimalFormat;
public class ConvertMoney6_3_6
{
    public static void main(String args[]){
        //创建扫描器
        Scanner s=new Scanner(System.in);
        //接收输入
        System.out.println("请输入一个金额");
        String convert=convert(s.nextDouble());
        //输出大写金额
        System.out.println(convert);
    }
    public static String convert(double d){
        //实例化DecimalFormat对象
        DecimalFormat df=new DecimalFormat();
        //格式化Double数字 
        String strNum=df.format(d);
        //判断是否含有小数点
        if(strNum.indexOf(".")!=-1){
            String num=strNum.substring(0,strNum.indexOf("."));
            //整数部大于12不能转换
            if(num.length()>12){
                System.out.println("数字太大不能转换");
                return "";
            }         
        }
        String point="";
        if((strNum.indexOf("."))!=-1){
            point="元";
            
        }
        else{
            point="元整";
        }
        //转换结果
        String result=getInteger(strNum)+point+getDecimal(strNum);
        if(result.startsWith("元")){
            result=result.substring(1,result.length());
        }
        return  result;
    }
    public static String getInteger(String num){
        //判断是否包含小数点
        if((num.indexOf("."))!=-1){
            num=num.substring(0,num.indexOf("."));
        }
        //反转字符串
        num=new StringBuffer(num).reverse().toString();
        //创建一个StringBuffer对象
        StringBuffer temp=new StringBuffer();
        //加入单位
        /*for(int i=0;i<temp.length();i++){
            temp.append(STR_UNIT[i]);
            temp.append(STR_NUMBER[num.charAt(i)-48]);
        }
        num=temp.reverse().toString();
       // 替换字符串的字符
        num=num.replace(num,"零拾","零");
        num=numReplace(num,"零佰","零");
        num=numReplace(num,"零仟","零");
        num=numReplace(num,"零万","零");
        num=numReplace(num,"零亿","零");
        num=numReplace(num,"零零","零");
        num=numReplace(num,"亿万","亿");
        //如果字符串以零结尾将其去除
        if(num.lastIndexOf("零")==num.length()-1){
            num=num.substring(0,num.length()-1);
        }
        return num;
    }
}*/
