import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*此代码块是杨辉三角
public class Test {
    public static void yang (int num) {
        List<List<Integer>> ret = new ArrayList<>();//这里新建一个Arraylist是为了存储每一行
        List<Integer> list1 = new ArrayList<>();//这里的Arraylist是具体到每一行
        list1.add(1);//第一行是只有一个1
        ret.add(list1);
        for (int i = 1; i < num; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> pre = ret.get(i-1);
            for (int j = 1; j < i; j++) {//第二行i和j都是1所以不会进入该循环,这里是中间的处理过程
                int num1 = pre.get(j) +pre.get(j-1);
                list.add(num1);
            }
            list.add(1);
            ret.add(list);
        }
        for (int i = 0; i < ret.size(); i++) {
            System.out.println(ret.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        yang(num);
    }
}
*/
/*此代码块是牛课题计算一个数他的二进制数中一的个数
public class Test {
    public static int cal(int sum) {
        if (sum == 0) {
            return 0;
        }
        int count = 0;
        while (sum != 1) {
            if ((sum & 1) == 1) {
                count ++;
            }
            sum = sum >> 1;
        }
        count ++;
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int sum = in.nextInt();
            System.out.println(cal(sum));
        }
    }
}*/
public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
    }
}