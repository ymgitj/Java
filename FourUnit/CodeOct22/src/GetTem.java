/*实现
if(){}
else if(){}
else If(){
    
 }*/
import java.util.Scanner;
public class GetTem
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("请输入a");
        int a=s.nextInt();
        System.out.println("请输入b");
        int b=s.nextInt();
        if(a>b)
        {
            System.out.println(a+" is max "+b);
        }
        else if(a==b){
            System.out.println(a+"equals"+b);
        }else if(a<b)
        {
            System.out.println(b +" is max "+a);
        }
    }
}
