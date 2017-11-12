/*
实现：对矩阵进行转置运算
*/
package Content;
import java.util.concurrent.ForkJoinTask;

public class ArrayRowColumnSwap
{
    public static void main(String args[]){
        //声明矩阵
        int arr[][]=new int[][]{
             {1,2,3},
             {4,5,6},
             {7,8,9}};
             //转置前
             System.out.println("转置前");
             //输出转置前的数组 
             printArray(arr);
        //int temp[][]=new int[arr.length][arr.length];
             //转置后的数组
             System.out.println("转置后的数组");
             
             printArray(toSwap(arr));
    }
    //输出数组元素方法实现
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //转换方法实现
    public static int[][] toSwap(int arr[][]){
        //声明一个过度数组
        int temp[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                temp[i][j]=arr[j][i];
            }
        }
        return temp;
         
    }
}
