/*
Achieve:创建Book类并在该类中使用成员变量
Time:07:14_Nov01
*/
package Content;

public class Book7_3
{
    //定义一个int 型的变量
    private int id;
    //定义一个String型的变量
    private String name;
    private String category;
    
    //定义一个getName方法
    public String getName(){
        //定义局部变量
        int id=0;
        //调用该类中的其它方法
        setName("java");        
        return id+this.name;
    }
    private void setName(String name){
        this.name=name;
    }
    //返回Book类引用 
    public Book7_3 getBook(){
        return this;
    }
    
}
