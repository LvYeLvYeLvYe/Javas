package com.company;

public  class Test {
    public static void main(String[] args) {
        //三目运算符：
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println(c);
    }
    public static void main8(String[] args) {
        //位移运算：
        //<<左移：左移一位相当于乘以2；>>右移：右移一位相当于除以2；>>>无符号右移：
    }
    public static void main7(String[] args) {
        //位运算符：
        //&按位与：两个1才是1；|按位或：^有一个1就是1；按位异或：有不同才是1；~按位取反：取反。
    }
    public static void main6(String[] args) {
        byte a = 1,b = 2;
        int d = a+b;
        byte c = (byte) (a+b);//只能将a+b强制转换成byte型才可以，因为a+b运算时会把byte或short类型转换为int型提升效率方便运算。
    }
    public static void main5(String[] args) {
        int num = 10;
        String ret =String.valueOf(num);
        System.out.println(ret);
        String ret2 = num+"";
        System.out.println(ret2);//将整型num转换为字符型ret、ret2两种方法
        String str = "123";
        int ret1 = Integer.valueOf(str);
        System.out.println(ret1+1);//将字符型str转换为整型ret1(使用了包装类String.和包装类Integer.)
    }
    public static void main4(String[] args) {
        int a = 10;
        long b = a;
        System.out.println(b);
        long l =111111111111115411L;//虽然会输出但是只会输出
        int c = (int)l;
        System.out.println(c);
        int i1 = 10;
        long l1 = 15;
        int i2 = (int)(i1+l1);//如果两个变量的类型不一样，为了提升效率会把小的类型提升为大的类型再进行运算；
    }
    public static void main3(String[] args) {
        final int a = 10;
        final int b;
        b= 10;//!final 修饰的变量是常量,只能初始化一次！
    }
    public static void main1(String[] args) {
        System.out.println("hello");
        String str = "caonima";
        System.out.println(str);
    }

    public static void main2(String[] args) {
        System.out.println(10+(20+"hello"));
        System.out.println("a= "+10+",b= "+20);
    }
}//byte short int long
 //1     2     4    8
 //8     16    32   64
 //short  double
 // 4       8
 //char
 // 2
 //
