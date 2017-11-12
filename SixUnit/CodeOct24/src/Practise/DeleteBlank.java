/*
Achieve:不用去除空格方法去除字符串中有空格
Time:16:28_Oct30
*/
package Practise;

public class DeleteBlank
{
    public static void main(String args[]){
        //定义去除空格的字符串
        String s1=new String("   吕 hshsh   jshs 晶 ");
        //输出原来的字符串
        System.out.println("删除空格前的字符串为："+s1);
       
        
        //输出删除空格后的新字符串
        
        System.out.print("第一种分割删除空格后的字符串为：");
        toSplit(s1);
        System.out.print("第二种截取删除空格后的字符串为：");
        toCut(s1);System.out.println();
        System.out.print("第三种替换删除空格后的字符串为：");
        toReplace(s1);
    }
    //第一种分割
    public static void toSplit(String s){
        String str[]=s.split("");
         StringBuffer sb=new StringBuffer();
        //foreach遍历str
        for(int i=0;i<str.length;i++){
            if(str[i].equals(" ")){

            }
            else{
               sb.append(str[i]);
               
            }
        }
        System.out.println(sb);
    }
    //第二种截取
    public static void toCut(String s2){
        //建立索引
        for(int i=0;i<s2.length();i++){
            //截取相临索引的字符  
          String kongge=s2.substring(i,i+1);
           //比较
          if(kongge.equals(" ")){
              
          }
          else{
              System.out.print(kongge);
          }
       }
   }
   //替换
   public static void toReplace(String s){
       //
       s.replace(" ","");
       System.out.println(s);
   }
}
