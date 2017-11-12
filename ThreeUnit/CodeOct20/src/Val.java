class Val{
//定义成员变量age并赋值
    static String string="静态变量"; 
    public static void main(String args[])
    {
      //定义局部变量age 并赋值
      String string="局部变量";
      System.out.println("输出局部变量的值......"+string);
      System.out.println("输出静态变量的值......"+Val.string);
    }
}
