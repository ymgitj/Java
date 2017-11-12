import java.util.Scanner;

class Volume
{
    public static void main(String args[])
    {
      final double PI=3.1415926;
      System.out.println("输入圆的半径");
      Scanner s=new Scanner(System.in);
      double r=s.nextDouble();
      double volume=(4/3)*PI*r*r*r;
      System.out.println("球的体积为；"+volume);
    }
}
