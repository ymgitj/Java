
import java.util.Scanner;/**
 实现通过if else验证login的合法性
 */
public class CheckLogin
{
    public static void main(String args[])
    {
        //创建扫描器
        Scanner s=new Scanner(System.in);
        //提示输入
        System.out.println("请输入账户");
        //接收登录账户
        String str =s.nextLine();
        System.out.println("请输入密码");
        //接收登录密码
        String str2=s.nextLine();
        //账户检测
        if (!str.equals("myyu"))
        {
            System.out.println("账户非法");
        }
        else if (!str2.equals("123"))
        {
            System.out.println("密码错误|");
        }
        else
        {
            System.out.println("通过验证");
        }
    }
}
