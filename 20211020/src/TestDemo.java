import java.util.Scanner;
public class TestDemo {
    public static void main3(String[] args) {
        System.out.println(15>>1&1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("奇数位为：");
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(num>>i&1);
        }
        System.out.println();
        System.out.println("偶数位为：");//输出偶数位
        for (int i = 30; i >= 0; i -= 2){
            System.out.print(num>>i&1);//同奇数位
        }
    }
    public  static int calculate(int a){//方法的定义
        String mid = "";
        while(a!=0){
            if(a%2 == 0){
                mid = mid + "0";
            }else {
                mid = mid + "1";
            }
            a/=2;
        }
        int doubleNum = Integer.parseInt(mid);//将字符串转换为整型
        return  doubleNum;
    }
    public static void main1(String[] args) {//计算一个十进制数的二进制数，并输出他的奇偶位数字
        System.out.println("请输入一个数字：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int doubleNum = calculate(a); //方法的使用
        int mid = doubleNum, num = 0;
        System.out.println(doubleNum);
        while (mid != 0){
            mid /= 10;
            num++;
        }
    }
}
