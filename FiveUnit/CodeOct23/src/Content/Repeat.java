/*
实现：使用copyOfRange()方法
*/
package Content;
import java.util.Arrays;

public class Repeat
{
    public static void main(String args[]){
        //声明数组并初始化
        int arr[]=new int[]{1,4,66,36,5};
        //输出当前数组值是
        System.out.println("数组元素分别为");
        //foreach遍历数组
        for(int x:arr){
            System.out.print(x+" ");
        }
        //换行
        System.out.println();
        //使用copyOfRange复制新数组
       int newArr[]= Arrays.copyOfRange(arr,1,4);
        //输出新数组
        System.out.println("新数组为");
        for(int x:newArr){
            System.out.print(x+" ");
        }
        
    }
}
