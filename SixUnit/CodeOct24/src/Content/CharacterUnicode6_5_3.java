/*
Achieve:将字符串转换成字符数组,再将汉字和字母转换成Unicode码追加到字符串生成器中
Time:19:43_Oct29
*/
package Content;

public class CharacterUnicode6_5_3
{
    public static void main(String args[]){
        //获取用户输出的字符串
        String text="很高兴看到你";
        //获取字符串的字符数组
        char[] charArray=text.toCharArray();
        //创建字符串生成器
        StringBuilder builder=new StringBuilder();
        //遍历字符数组
        for(int i=0;i<charArray.length;i++){
            builder.append((int)charArray[i]+" ");
        }
        //输出
        System.out.println("很高兴看到你,的Unicode码是");
        System.out.println(builder.toString());
    }
}
