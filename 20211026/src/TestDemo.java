import java.util.Scanner;
public class TestDemo {
    public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
    }
    public static int sum2(int n){
        if(n == 1) return 1;
        return n+sum2(n - 1);
    }

    public static void main9(String[] args) {
        System.out.println(sum2(10));
    }
    public static void part(int n){
        if (n <= 9){
            System.out.println(n);
            System.exit(0);
        }
        System.out.println(n%10);
        part(n/10);
    }
    public static void main8(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        part(n);
    }
    public static int sum1(int n){
        if (n <= 9){
            return n;
        }
        return n%10 + sum1(n/10);
    }

    public static void main7(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum1(n));
    }
    public static int feb(int n){//斐波那契递归法
        if (n == 1) return 1;
        if (n == 2) return 2;
        return feb(n-1)+feb(n-2);
    }
    public static void main6(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("第"+n+"项为"+feb(n));
    }
    public static void move(int n, char a, char b){
        System.out.printf("将第"+n+"个盘子从"+a+"移动到"+b+"\n");
    }
    public static void hanoi(int n, char a, char b, char c){
        if (n == 1){
            move(n,a,c);
        }
        else{
            hanoi(n-1,a,c,b);
            move(n,a,c);
            hanoi(n-1,b,a,c);
        }
    }

    public static void main5(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char a = 'A', b = 'B', c = 'C';
        hanoi(n,a,b,c);
    }
    public static int jump2(int n){//迭代法
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int n1 = 1, n2 = 2,count = n;
        while (count > 2){
            int tmp = n2;
            n2 = n1 + n2;
            n1 = tmp;
            count--;
        }
        return n2;
    }

    public static void main4(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(jump2(n));
    }
    public static int jump1(int n){ // 递归法
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return jump1(n - 1)+jump1(n - 2);
    }

    public static void main3(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(jump1(n));
    }
    public static void sum_integer(int a, int b){
        System.out.println(a+b);
    }

    public static void sum_decimal(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public static void main2(String[] args) {
        sum_integer(5,6);
        sum_decimal(0.65,1.65,0.98);
    }
    public static double bigger(double a, double b){
        return a>b?a:b;
    }
    public static  void relation(double a, double b, double c){
        if(a>b){
            if(b>c){
                System.out.printf("%f>%f>%f",+a,+b,+c);
            }
            else {
                if(a>c){
                    System.out.printf("%f>%f>%f",+a,+c,+b);
                }
                else{
                    System.out.printf("%f>%f>%f",+c,+a,+b);
                }
            }
        }
        else{
            if (a>c){
                System.out.printf("%f>%f>%f",+b,+a,+c);//b>a    c>a
            }
            else {
                if (b>c){
                    System.out.printf("%f>%f>%f",+b,+c,+a);
                }
                else {
                    System.out.printf("%f>%f>%f",+c,+b,+a);
                }
            }
        }
    }
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.print("小数与小数"+bigger(c,d));
        System.out.println();
        System.out.print("整数与整数"+bigger(a,b));
        System.out.println();
        relation(a,c,d);
    }
}
