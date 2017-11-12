/*
实现：使用split()方法对字符串进行分割
18.48_Oct26
*/
package Content;

public class Division6_18
{
    public static void main(String args[]){
        //声明分割的字符串
        String s=new String("abc,def,ghi,jkl");
    
        //对字符串进行分割
        String s2[]=s2=s.split(",");
        //输出分割后的字符串
        for(int i=0;i<s2.length;i++){
            System.out.print(s2[i]);
        }
        
    }
}
