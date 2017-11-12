/*
实现：通过fill()方法填充数组元素，然后输出 
*/
package Content;
import java.util.Arrays;

public class Swap
{
    public static void main(String args[]){
        //创建int型数组
        int arr[]=new int[5];
        //填充元素
        Arrays.fill(arr,8);
        //for 循环遍历数组
        for(int i=0;i<arr.length;i++){
            System.out.println("第"+(i+1)+"个数组元素是"+arr[i]);
        }
    }
}
