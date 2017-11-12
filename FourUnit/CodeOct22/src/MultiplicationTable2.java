/*
实现：for循环计算1～100之间连续整数的和
如果和大于1000输出
*/
public class MultiplicationTable2
{
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
            if(sum>1000){
                System.out.println("1"+"到"+i+"的和为"+sum);
                break;
            }
        }
        //System.out.println(sum);
    }
}
