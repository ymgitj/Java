/*
实现：一维数组与二维数组所占内存大小比较
*/
package Content;

public class OneArrayMemory
{
    public static void main(String args[])
    {
        //数组中元素的个数
        int num1=1024*1024*2;
        //声明一维数组
        int arr[]=new int[num1];
        //为一维数组赋值
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        //计算一维数组所占内存大小将单位转换为M
        long memory1=Runtime.getRuntime().totalMemory()/1024/1024;
        //输出一维数组所占内存大小
        System.out.println(memory1);
        //二维数组元素个数
        int num2=1024*1024;
        //声明二维数组
        int twoArr[][]=new int[num2][2];
        //初始化二维数组
        for(int i=0;i<twoArr.length;i++){
            twoArr[i][0]=i;
            twoArr[i][1]=i;
       
        }
        //计算二维数组所占内存
        long memory2=Runtime.getRuntime().totalMemory()/1024/1024;
        //输出二维数组所占内存大小
        System.out.println(memory2);
    }
}
