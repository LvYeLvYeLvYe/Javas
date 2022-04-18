import java.util.Scanner;
import java.util.Random;
public class TestDemo {
    public static void main13(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i; j++) {
                String result = "%d*%d=%d\t";
                System.out.printf(result,j,i,i*j);
            }
            System.out.println("\n");
        }
    }
    public static void main12(String[] args) {
        Scanner input =new Scanner(System.in);
        String passwd = "xgq123456789";
        int chances=3;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("请输入你的密码：");
            String character = input.nextLine();
            if(character.equals(passwd)){
                System.out.println("登录成功！");
                System.exit(0);
            }
            else{
                if (chances>1){
                    chances--;
                    String warn = "密码错误，你还有%d次机会！";
                    System.out.printf(warn,chances);
                }
                else{
                    System.out.println("密码输错三次，系统关闭！");
                    System.exit(0);
                }
            }
        }
    }
    public static void main11(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(),count=1;
        while(num!=1){
            if(num%2 == 1){
                count++;
                num /= 2;
            }
            else{
                num /=2;
            }
        }
        System.out.println(count);
    }
    public static void main10(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), mid1,mid2,result=1;
        if(a > b){
            while(true){
                mid1 = a % b;
                mid2 = a / b ;
            }
        }
        System.out.println(result);
    }//不会写。。。
    public static void main9(String[] args) {
        double sum = 0.0;
        for (double i = 1; i <=100; i++) {
            if(i%2!= 0){
                sum = sum + 1/i;
            }
            else{
                sum = sum - 1/i;
            }
        }
        System.out.println(sum);
    }
    public static void main8(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int units = i % 10, tens = i / 10 % 10, hundreds = i / 100;
            int judge = units*units*units + tens*tens*tens + hundreds*hundreds*hundreds;
            if(judge==i){
                System.out.println(i);
            }
        }
    }
    public static void main7(String[] args) {
        System.out.println("请输入一个数字系统将判断它与随机数的关系：");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        Random ran = new Random();
        int ranNum = ran.nextInt();
        String bigger = "随机数%d更大";
        String smaller = "随机数%d更小";
        if(ranNum > count){
            System.out.printf(bigger,ranNum);
        }
        else if(ranNum <  count){
            System.out.printf(smaller,ranNum);
        }
        else{
            System.exit(0);
        }
    }
    public static void main6(String[] args) {
        System.out.println("输入一个数字：");
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                if (i==j || i+j==X-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main5(String[] args) {
        System.out.println("请输入年龄以便程序判断：");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year<=18){
            System.out.println("少年");
        }
        else if (year>19&&year<=28){
            System.out.println("青年");
        }
        else if (year>29&&year<=55){
            System.out.println("中年");
        }
        else {
            System.out.println("老年");
        }
    }
    public static void main4(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt(),count = 0;
        for (int i = 1; i <=num/2; i++) {
            if(num%i==0){
                count++;
            }
        }
        String result = "%d是素数";
        if (count==1|| count==2){
            System.out.printf(result,num);
        }
    }
    public static void main3(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if(count==1|| count==2)
            {
                System.out.println(i);
            }
        }
    }
    public static void main1(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if (i%9!=0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
