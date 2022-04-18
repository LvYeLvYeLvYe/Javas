import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static boolean palindrome(String S) {//该方法判断字符串是否回文
        int flag = S.length();
        if(S.length() %2 == 1) {//字符串为奇数位
            for (int i = 0; i < (S.length()/2);i++) {
                if (S.charAt(i)!=S.charAt(--flag)) {
                    return false;
                }
            }
            return true;
        }
        else {//字符串为偶数
            for (int i =0; i < (S.length()/2);i++) {
                if (S.charAt(i)!=S.charAt(--flag)) {
                    return false;
                }
            }
            return true;
        }
    }
     static int judge(String A, String B) {//该方法计算A,B有几种回文
        int flag = 0;
        for (int i = 0;i < A.length() + 1; i++) {
            StringBuffer stringBuffer = new StringBuffer(A);
            if(palindrome(String.valueOf(stringBuffer.insert(i,B)))==true) {
                flag ++;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        if (A.length()<0&&B.length()<0&&A.length()>100&&B.length()>100) {
            System.out.println("字符串不符合要求，请检查！");
            System.exit(0);
        }else {
            System.out.println(judge(A,B));
        }
    }
}
