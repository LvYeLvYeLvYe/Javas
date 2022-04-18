class Calculate{//两个变量相加
    private int num1;
    private int num2;
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add() {
        return num1+num2;
    }
}
class Exchange{//两个变量交换值
    private int num1;
    private int num2;
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void change(){
        int tmp = this.num1;
        this.num1 = this.num2;
        this.num2 = tmp;
        System.out.println("num1 = " + this.num1);
        System.out.println("num2 = " + this.num2);
    }
}
public class TestDemo {
    public static void main(String[] args) {//两个变量交换值
        Exchange exchange = new Exchange();
        exchange.setNum1(10);
        exchange.setNum2(20);
        exchange.change();
    }
    public static void main1(String[] args) {//两个变量相加
        Calculate sum = new Calculate();
        sum.setNum1(5);
        sum.setNum2(6);
        System.out.println(sum.add());//调用add()方法
    }
}
