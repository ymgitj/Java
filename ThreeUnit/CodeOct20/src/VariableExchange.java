import java.util.Scanner;
class VariableExchange{

    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("请输入A的值");
      long A=s.nextLong();
      System.out.println("请输入B的值");
      long B=s.nextLong();
      System.out.println("A="+A+"\t"+"B="+B);
      System.out.println("交换变量");
      A=A^B;
      B=B^A;
      A=A^B;
      System.out.println("A="+A+"\t"+"B="+B);
    }
}
