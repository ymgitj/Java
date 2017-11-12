/*
实现：创建一个数组实现将此数组复制得到一个长度为5的新数组
,并将数组输出
使用copyOf()
*/
package Content;
import java.util.Arrays;

public class Copy
{
    public static void main(String args[]){
        //创建一个数组并初始化
        int arr[]=new int[]{37,87,9};
        //输出原来的数组
        System.out.println("原来的数组为");
        //foreach遍历数组
        for(int x:arr){
            System.out.print(x+" ");
        }
        //换行
        System.out.println();
        //复制得到新数组 
        int newArr[]=Arrays.copyOf(arr,5);
        //输出新数组
        System.out.println("新数组为");
        //foreach遍历数组
        for(int x:newArr){
            System.out.print(x+" ");
        }
    }
}
