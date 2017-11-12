/*
实现：求方阵的迹
即方阵主对角线上的和
*/
package Content;

public class Trace
{
    public static void main(String args[]){
        //声明方阵数组
        int arr[][]=new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        //该矩阵为
            toPrint(arr);
        //计算矩阵的迹
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j)
                    sum+=arr[i][j];
            }
        }
        //该矩阵的迹为
        System.out.println("迹为："+sum);
        
        
    }
    //输出二维数组方法
    public static void toPrint(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
    
}
