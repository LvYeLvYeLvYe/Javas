import java.util.Arrays;
import java.util.Scanner;
public class TestDemo {
    public static String toString(int [] a){
        String out = "\"[";
        for (int i = 0; i < a.length; i++) {
            out = out +" " + String.valueOf(a[i])+",";
        }
        out = out.substring(0, out.length() - 1);
        out = out + "]" + "\"";
        return out;
    }
    public static void main(String[] args) {
        int a[] = {1,5,3,56,4,1};
        System.out.println(toString(a));
    }
    public static String copyOf(int [] a){//复制数组
        int [] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return Arrays.toString(b);
    }
    public static void main10(String[] args) {
        int[] a = {1,3,5,8,4,36,45};
        System.out.println(copyOf(a));
    }
    public static int dou(int n){//二分查找
        int [] a = {13,26,45,76,88,200,201};
        int left = 0, right = a.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (a[mid] == n) return mid;
            else if (a[mid] < n){
                left = mid + 1;
            }
            else if (a[mid] > n){
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main9(String[] args) {//二分查找
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(dou(num));
    }
    public static void main8(String[] args) {
        int [] a ={1,2,3,4,5};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]){
                System.out.println("非有序数组！");
                System.exit(0);
            }
        }
        System.out.println("有序数组！");
    }
    public static void main7(String[] args) {//冒泡排序
        int [] a = {11,13,5,6,9};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j+1]){
                    int tmp;
                    tmp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        String out = Arrays.toString(a);
        System.out.println(out);
    }
    public static void main6(String[] args) {//找出出现只一次的数字
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        String out = Arrays.toString(a);
        System.out.println(out);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if(a[i] == a[j]) break;
                else{
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
    public static void main5(String[] args) {//创建数组并赋值
        int [] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i+1;
        }
        String out = Arrays.toString(a);
        System.out.println(out);
    }
    public static void printArray(int [] arr){//打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main4(String[] args) {
        int [] a ={13,46,6,24,8,4};
        printArray(a);
    }
    public static int [] transform(int [] arr){//数组元素乘以二
        for (int i = 0; i < 6; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
    public static void main3(String[] args) {
        int [] a ={13,46,6,24,8,4};
        a = transform(a);
        String out = Arrays.toString(a);
        System.out.println(out);
    }
    public static int sum(int [] arr){
        return arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
    }//数组元素之和

    public static void main2(String[] args) {
        int [] a ={13,46,6,24,8,4};
        System.out.println(sum(a));
    }
    public static double avg(int [] arr){//求数组平均值
        double aver = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5])/6.0;
        return aver;
    }
    public static void main1(String[] args) {
        int [] a ={13,46,6,24,8,4};
        System.out.println(avg(a));
    }
}

