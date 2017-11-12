/*
实现：遍历二维数组，将二维数组的元素输出 
*/
package Content;

public class Trap
{
    public static void main(String args[]){
        //声明二维数组
        int arr[][]=new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("使用一般for循环输出");
        //输出二维数组
        toPrint1(arr);
        System.out.println("使用foreach输出");
        toPrint2(arr);
    }
    //定义二维数组输出的方法
    public static void toPrint1(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void toPrint2(int arr[][]){
        //使用foreach遍历数组
        for(int[] x:arr){
            for(int j:x){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
