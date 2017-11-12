/*
实现：获取一维数组的最小值
*/
package Content;

public class MinNum
{
    public static void main(String args[]){
        //声明数组arr并初始化
        int arr[]={18,64,97,47,36,7};
        //假设arr[0]为数组元素中最小值
        int min=arr[0];
        //for循环遍历数组找到最小值
        for(int i=0;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }
           
        }
        //输出最小值
        System.out.println("min value="+min);
        
    }
}
