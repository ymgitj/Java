class Calculation{
    public static void main(String args[])
    {
      int a=8;
      int b=6;
      boolean b1=((a>b)&&(a!=b));
      boolean b2=((a>b)||(a!=b));
      System.out.println("(a>b)&&(a!=b)的值为...."+b1);
      System.out.println("(a>b)||(a!=b)的值为...."+b2);
    }
}
