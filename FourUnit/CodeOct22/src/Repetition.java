/*
  实现：foreach
*/
public class Repetition
{
    public static void main(String args[]){
        //定义一个一维数组
        int arr[]={7,10,1};
        System.out.println("数组元素为");
        //输出数组元素
        for(int x: arr){
            System.out.println(x+"\t");
        }
    }
}
