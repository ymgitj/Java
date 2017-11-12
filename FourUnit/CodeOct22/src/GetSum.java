
import java.util.Scanner;/*
实现：通过while循环将1～10相加
*/
public class GetSum
{
    public static void main(String args[]){
        //获取求和值
        Scanner s=new Scanner(System.in);
        System.out.println("求取某数之间整数之和");
        //接收
        int i=s.nextInt();
        int sum=0;
        while(i>0){
            sum=sum+i;
            i--;
        }
        System.out.println("其和为"+sum);
    }
}
