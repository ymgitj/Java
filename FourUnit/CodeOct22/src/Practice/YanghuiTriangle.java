/*
实现：输出杨辉三角
两侧数值均为1，其它位置上的数值是其正上方与左上角数值之和
*/
package Practice;

public class YanghuiTriangle
{
    public static void main(String args[])
    {
        yangHui(10);
    }
    public static void yangHui(int n){
        int arr[][]=new int[n][];
        int i,j;
        for(i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
            for(j=0;j<arr[i].length-1;j++){
                if(i==0||j==0||j==arr[i].length-1)
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
            
        }
    }
}
