/*
实现：输出一个三行四列的矩阵,且数组元素都为0
*/
package Content;

public class Matrix
{
    public static void main(String args[]){
        //声明一个三行四列的数组并初始化
        int arr[][]=new int[3][4];
        //输出说明
        System.out.println("输出一个三行四列的矩阵");
        //foreach遍历数组
        for(int[] x:arr){
          for(int j: x){
              System.out.print(j+" ");
          }
          //换行
          System.out.println();
        }
    }
}
