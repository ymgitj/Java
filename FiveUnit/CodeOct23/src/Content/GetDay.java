/*
实现：创建int型数组,将各月的天数输出 
*/
package Content;

public class GetDay
{
    public static void main(String args[]){
        //声明数组
        int day[]={31,28,31,30,31,30,31,31,30,31,30,31};
        //遍历数组
        for(int i=0;i<day.length;i++){
            System.out.print((i+1)+"月有"+day[i]+"天"+" ");
            if((i+1)%3==0){
                System.out.println();
            }
        }
    }
}
