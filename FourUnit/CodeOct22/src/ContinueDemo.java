/*
 实现：通过while循环和continue语句输出10以内
 的奇数
 */
public class ContinueDemo
{
    public static void main(String args[])
    {
        int i=10;
        while (i>0)
        {
            i--;     //放上面防止被continue跳过
            if (i % 2 == 0)
                continue;
                //条件成立跳过输出
            System.out.println(i);
            
        }
    }
}
