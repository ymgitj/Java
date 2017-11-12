/*
实现：通过==,equals(),equalsIgnoreCase()
三种方法比较字符串是否相等
*/
package Content;

public class Opinion6_15
{
    public static void main(String args[]){
        //声明字符串s1,s2,s3
        String s1="I am a boy";
        String s2="I am a boy";
        String s3="I AM A BOY";
        //输出s1,s2,s3
        System.out.println("s1为\n"+s1);
        System.out.println("s2为\n"+s2);
        System.out.println("s3为\n"+s3);
        //比较s1和s2三种方法并输出
        System.out.println("使用==比较结果为\n"+(s1==s2));
        System.out.println("使用equals()方法比较结果为\n"+(s1.equals(s2)));
        System.out.println("使用equalsIgnoreCase方法比较结果为\n"+(s1.equalsIgnoreCase(s2)));
        //比较s1和s3
        System.out.println("使用==比较结果为\n"+(s1==s3));
        System.out.println("使用equals()方法比较结果为\n"+(s1.equals(s3)));
        System.out.println("使用equalsIgnoreCase方法比较结果为\n"+(s1.equalsIgnoreCase(s3)));
        
        
        
        
    }
}
