/*
实现：foreach和continue
*/
package Practice;

public class CycFilter
{
    public static void main(String args[]){
        System.out.println("在我的花园里有很多鸟类,最近来了几只老鹰,请帮我把它抓住");
        String str[]=new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","乌鸦","老鹰","布谷鸟"};
        for(String x:str){
            if(x.equals("老鹰")){
                System.out.println("抓住一只老鹰");
                continue;
            }
            System.out.println("搜索发现一只....."+x);
        }
    }
}
