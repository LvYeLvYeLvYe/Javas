import java.util.Arrays;
public class TestDemo {
    public static void main2(String[] args) {//打印方法
        //①用for循环遍历
        int [][] array = {{1,2,3},{1,2,3}};
        for (int i = 0; i < array.length; i++) {//代表哪一行
            for (int j = 0; j < array[i].length; j++) {//代表哪一列
                System.out.print(array[i][j]+" ");
            }
            System.out.println("======================");
        }
        //②用foreach遍历
        for (int [] ret : array) {//把二维数组里的行传过去用一个数组ret接收
            for (int x: ret) {//用x来接收上一个循环中数组ret里的元素
                System.out.println(x + " ");
            }
            System.out.println("======================");
        }
        //③用方法打印
        System.out.println(Arrays.deepToString(array));
    }
    public static void main1(String[] args) {//二维数组
        int [][] array = {{1,2,3},{1,2,3}};
        int [][] array2 = new int [][] {{1,2,3},{1,2,3}};
        int [][] array3 = new int[2][3];
                                    //行//列
    }
}
