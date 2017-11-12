/*
实现：遍历一维数组
*/
package Exercise;

public class Exercise
{
    public static void main(String args[]){
        //创建一维数组并初始化
        int arr[]=new int[]{7,6,4,4,9,3};
        //创建二维数组
        int twoArr[][]=new int[][]{
            {7,8,9,},
            {28,6,5,5,7}};
        //输出一维数组
        System.out.println("该数组的值为：");
        //for循环遍历数组
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //换行
        System.out.println();
        //输出该数组中最大的元素
        System.out.println("该一维数组中最大的元素为："+max(arr));
        System.out.println("该二维数组所有元素的和为"+sum(twoArr));
        
    }//定义max方法 
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //定义二维数组求和方法
    public static int sum(int arr[][]){
        int sum=0;
        //遍历二维数组
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
