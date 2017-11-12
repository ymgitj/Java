/*
实现：使用冒泡排序法排序 
*/
package Content;

public class BubbleSort
{
    public static void main(String args[]){
        //声明数组并初始化
        int arr[]=new int[]{19,3,79,8,90,5};
        //输出排序前数组元素
        System.out.println("排序前");
        //foreach遍历数组
        for(int x:arr){
            System.out.print(x+" ");
        }
        //换行
        System.out.println();
        //排序后
        System.out.println("排序后");
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                //比较相临两个元素的大小,如果前面的元素大于后面的元素进行交换
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
                 System.out.print(arr[j]+" ");
            }
            System.out.print("[");
            for(int j=arr.length-i;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println("]");
        }
    }
}
