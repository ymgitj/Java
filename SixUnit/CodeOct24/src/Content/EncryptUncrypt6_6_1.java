/*
Achieve:将字符串转换为字节数组,再将每个字节和密文字符异或操作进行加密,做相反的操作就可以进行解密
Time:15:07_Oct30
*/
package Content;


public class EncryptUncrypt6_6_1
{
    public static void main(String args[]){
        //对value进行加密;secret密文字符
        //声明加密字符串
        //注这里中文加密解密不行
        String value="I love Java";
        //加密密文
        char serect='祈';
        //输出原字符串
        System.out.println("原字符串为："+value);
        //加密
        String encrypt=EncryptUncrypt6_6_1.EAndU(value,serect);
        //输出加密后的字符串为
        System.out.println("加密后的字符串为"+encrypt);   
        //解密
        String uncrypt=EncryptUncrypt6_6_1.EAndU(encrypt,serect);
        //输出解密后的值
        System.out.println("解密后的值为："+uncrypt);
    }
    public static String EAndU(String value,char secret){
       // 将需要加密的内容转换为字符节数组
        byte[] bt=value.getBytes();
        //通过异或操作进行加密
        for(int i=0;i<bt.length;i++){
            bt[i]=(byte)(bt[i]^(int)secret);
            
        }    
        //返回加密结果 
        return new String(bt,0,bt.length);
    }
    
}
