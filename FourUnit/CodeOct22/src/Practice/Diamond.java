/*
 实现：输出空心菱形
 */
package Practice;

public class Diamond
{
    public static void main(String args[])
    {                  
        printHollowRhombus(15);
    }
    //输出菱形(11,1=5)
    public static void printHollowRhombus(int size)
    {
        if (size % 2 == 0)
            size += 1;
        int a,b=0;

        for (a = 0;a < size/2+1;a++)    //启行 0
        {

            for (b = size / 2;b > a;b--)   //控制空白输出
            {
                System.out.print(" ");     //输出空格
            }
            for(b=0;b<2*a+1;b++){         //输出菱形上半部分
                if(b==0||b==2*a){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
          
            System.out.println();
        }
        //输出空心菱形下部分
        for(a=size/2+1;a<size;a++){          //启行size/2+1行
            for(b=size/2;b<a;b++){           //控制空白区域
                System.out.print(" ");       //输出空格
            }
            for(b=0;b<2*a+1;b++){
                if(b==0||b==2*(size-a-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

