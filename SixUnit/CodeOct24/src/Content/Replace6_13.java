/*
实现：使用replace()方法
*/
package Content;

public class Replace6_13
{
    public static void main(String args[]){
        //定义被替换的字符串
        String s="here you are";
        //输出
        System.out.println("替换前为\n"+s);
        //替换赋值给新字符串s2
       String s2= s.replace("you","them");
        //替换后结果输出
        System.out.println("替换后为：\n"+s2);
    }
}
