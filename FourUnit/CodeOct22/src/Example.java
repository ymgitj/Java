/**
  通过扫描器获取应聘员工的姓名和应聘的部门
  
*/
import java.util.Scanner;

public class Example
{
    public static void main(String args[]){
        //扫描器
        Scanner s=new Scanner(System.in);
        System.out.println("请输入姓名");
        //获取姓名
        String name=s.nextLine();
        //获取应聘者所要应聘的语言部门类型
        System.out.println("请输入应聘职位");
        String language=s.nextLine();
        switch(language.hashCode())
        {
            case 3254818 ://java的哈希码
            case 2301506 :
            case 2269730 :
                System.out.println(name+"应聘"+language+"组");
                break;
            case 3104 :
            case 2112 :
                System.out.println(name+"应聘"+language+"组");
                break;
            default :
            System.out.println("本公司不需要"+language+"的职员");
            break;
        }
    }
}
