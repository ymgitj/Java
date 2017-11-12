/*
实现：对数组进行排序使用*Arrays.sort()方法
*/
package Content;
import java.util.Arrays;

public class Taxis
{
    public static void main(String args[]){
        //创建数组并初始化
        int arr[]=new int[]{6,5,3,4,5};
        //循环遍历数组并输出
        System.out.println("old arrays is :");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        //提示排序后的数组
        System.out.println("升序排序后的数组是");
        for(int x:arr){
            System.out.print(x+" ");
        }
        
        
    }    
    
}
