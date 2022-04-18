import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Collection<Character> list1 = new ArrayList<>();
        String str1 = "welcome to bit";
        String str2 = "come";
        for (int i = 0; i < str1.length() - 1; i++) {
            if (!str2.contains(str1.charAt(i)+"")) {
                list1.add(str1.charAt(i));
            }
        }
        for (char ch : list1) {
            System.out.print(ch);
        }
    }
}
