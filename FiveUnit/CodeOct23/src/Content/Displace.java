/*
实现：fill(int a[],int fromIndex,int toIndex,int value);
*/
package Content;

import java.util.Arrays;

public class Displace
{
    public static void main(String args[]){
        //创建数组 
        int  arr[]=new int[5];
        //用fill()方法对数组进行初始化
        Arrays.fill(arr,3,5,6);
        //for循环遍历数组将数组 输出 
        for(int x:arr){
            System.out.print(x+" ");
            
        }
    }
}
