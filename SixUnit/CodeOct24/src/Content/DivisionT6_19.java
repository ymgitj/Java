/*
实现：split(String sign,int limit);
19.30_Oct26
*/
package Content;

public class DivisionT6_19
{
    public static void main(String args[]){
        //定义要分割的字符串
        String s=new String("qwe,rty,uio,p");
        //分割前的字符串为
        System.out.println("分割前的字符串为\n"+s);
       
        //进行字符串分割
        String s2[]=s.split(",",2);
        //输出以,为分割sign分割两次后的字符串为
        System.out.println("分割后的字符串为");
        for(int i=0;i<s2.length;i++){
            System.out.print(s2[i]);
        }
        
    }
    
}
