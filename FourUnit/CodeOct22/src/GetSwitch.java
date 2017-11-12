
import java.util.Scanner;/*
   实现switch语句
*/
public class GetSwitch
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        switch(str)
        {
            case "上班":
                System.out.println("明天上班");
                break;
            case "不上班":
                System.out.println("明天不上班");
                break;
           // case 1.1: case 后面的表达式不能为实数
             default :
             System.out.println("请重来");
             break;
        }
    }
}
