class Part
{
   //声明常量PI
   static final double PI=3.1415926;
   //声明int 型变量并进行赋值
   static int age=20;
   public static void main(String args[])
   {
      //声明int 型常量number
      final int number=39;
      //再次对age进行赋值
      age=839;
      System.out.println("常量PI的值"+PI);
      System.out.println("将number值输出"+number);
      System.out.println("将age的值输出"+age);
   }
 }
