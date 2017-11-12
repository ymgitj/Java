/*
实现：使用for循环根据数组的下标,将数组的每个元素相加求和
*/
package Content;

public class SumNum
{
    public static void main(String args[]){
       //声明并初始化数组
        int arr[]={1,39,89};
        //将和结果赋值给sum
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        //输出其和
        System.out.println("和为"+sum);
    }
}
