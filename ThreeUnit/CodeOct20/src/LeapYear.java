import java.util.Scanner;
class LeapYear{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("输入一个年份");
      int year=s.nextInt();
      if((year%400==0)||(year%100!=0)&&(year%4==0))
      System.out.println("year is ");
      else
      System.out.println("year isn't"); 
    }
}
