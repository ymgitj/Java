/*
 实现：创建一个数组使用foreach遍历数组当遇到
 "老鹰"时则立刻中断循环
 然后创建一个二维数组使用双层foreach遍历当发现第一个
 小于60的元素时中断双层循环
 */
package Practice;

public class BreakCyc
{
    public static void main(String args[]){
        String arr[]=new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","老鹰","布谷鸟"};
        System.out.println("当你发现第一只老鹰时,告诉我都有什么鸟");
        //foreach遍历数组arr[]
        for(String x:arr){
            if(x.equals("老鹰")){
              //中断循环
               break;
            }
            //输出老鹰之前的鸟类
            System.out.print(x+"\t");
        }
        System.out.println();
        //二维数组
        int str[][]=new int[][]{{76,85,39,70,63},{36,75,85,44,85},{73,55,79,39,80}};
      //双层foreach遍历数组str[][]
        for(int[] x:str){
            for(int j:x){
                //输出成绩
                System.out.print(j+" ");
                if(j<60){
                    //输出不及格的成绩
                    System.out.print("不及格-->"+j+"\n");
                    //如果成绩不及格中断所有输出
                    break;
                }
                System.out.println();
                
            }
        }
        
    }
}
