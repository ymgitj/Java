/*
实现：输出九宫格
即九宫格的对角直线相加都为15
*/
package Content;

public class NineTable
{
    public static void main(String args[]){
        //创建一个三阶方阵
        int arr[][]=new int[3][3];
        //初始化方阵
        int a=2;//第三行的行下标
        int b=3/2;//第二列的列下标
        //初始化数组
        for(int i=1;i<=9;i++){
            arr[a++][b++]=i;
            if(i%3==0){
                a=a-2;
                b=b-1;
            }
            else{
                a=a%3;
                b=b%3;
            }
        }
        //将九宫格输出 
        System.out.println("输出九宫格");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println("1对3取余数"+(1%3));
       
    }
}
