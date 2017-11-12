/*
Achieve:使用StringBuilder类中的方法去掉字符串中重复的字符
Time:19:58_Oct29
*/
package Content;

public class SBDelete6_5_4
{
    public static void main(String args[]){
        String s="圆圆，圆圆，回国回加架车累加器圆圆";
        //创建字符串生成器,并赋初始值
        StringBuilder builder=new StringBuilder(s);
        //输出原字符串
        System.out.println("原字符串为："+builder);
        System.out.println("原字符串的长度为："+builder.length());
        //每个字符和其后的进行比较
        for(int i=0;i<builder.length();i++){
            for(int j=i+1;j<builder.length();j++){
                if(builder.charAt(i)==builder.charAt(j)){
                    System.out.println("删除字符串"+builder.charAt(j));
                    builder.deleteCharAt(i);
                
            }
            
         }
      }
        //输出新字符串
        System.out.println("删除重复字符后的字符串为："+builder);
        //输出删除后字符串的长度为
        System.out.println("新字符串的长度为"+builder.length());
    
    }
}
//problem
