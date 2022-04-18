class test {
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
    public static void main(String[] args) {
        System.out.println(palindrome("aaabbbaaa"));
    }
}