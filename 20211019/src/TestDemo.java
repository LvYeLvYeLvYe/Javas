import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestDemo {
    public static int sumAdd(int n){//n是形参<-------- |
        int sum = 0;                     //                           |
        for (int i = 1; i < n; i++) {    //                           |
            sum = sum +i;               //                          |
        }                                      //                         |
        return sum;                         //                        |
    }                                            //                       |
    public static void main(String[] args) {   //              |
        int ret = sumAdd(10);//n实参-------------  |
        System.out.println(ret);
    }
    public static void main3(String[] args) {//不同的创建并给数组赋值的方法；
        int a[] = new int[]{123,456,335,664,645};
        int b[] = {123,654,663,5646,6};
        int c[] = new int[]{4,5,5,5};
    }
    public static void main2(String[] args) {//冒泡排序，要进行个数减1次排序，需要嵌套两个循环。
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        int change = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
            System.out.printf("\t");
        }
        System.out.printf("\n");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if(a[j] > a[j+1]){
                    change = a[j];
                    a[j] = a[j+1];
                    a[j+1] = change;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
            System.out.printf("\t");
        }
    }
    public static void main1(String[] args) {//输出一个随机数数组中的最大值
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        int max = a[0];
        for (int i = 0; i <= 3; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        System.out.println(max);
    }
}
