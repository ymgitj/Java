/*
实现：使用直接插入排序法排序
*/
package Content;

public class InsertSort
{
    public static void main(String args[]){
        
        //声明一维数组并初始化数组
        int arr[]=new int[]{45,7,9,8,45,32,83,5};
        //输出排序前的数组元素
        System.out.println("排序前的数组元素为");
        //foreach遍历数组 
        for(int x:arr){
            System.out.print(x+" ");
        }
        //换行
        System.out.println();
        //声明临时变量
        int insertValue;
        int insertKey;
         //for循环遍历数组并排序
        for(int i=1;i<arr.length;i++){
            insertValue=arr[i];
            for(insertKey=i-1;insertKey>=0&&arr[insertKey]>insertValue;insertKey--){
                //交换数据
                arr[insertKey+1]=arr[insertKey];
            }
            //在排序位置插入数据
            arr[insertKey+1]=insertValue;
        }
        //输出排序后的数组
        System.out.println("排序后的数组");
        //foreach遍历数组
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
