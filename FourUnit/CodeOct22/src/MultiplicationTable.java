/*
实现：九九成法表
*/
public class MultiplicationTable
{
    public static void main(String args[]){
        int i,j;
        //控制行数
        for(i=1;i<=9;i++)
        {
            System.out.println();
            //控制列数
            for(j=1;j<=i;j++){
              System.out.print(j+"*"+i+"="+i*j+" ");
            }
        }
    }
}
