import java.util.Scanner;

class ParityCheck
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("请输入一个整数：");
      int f=s.nextInt();
      if((f%2)==0)
      System.out.println(f+"为偶数");
      else
      System.out.println(f+"为奇数");
    }
}
