import java.util.Arrays;

public class SeqList {
    int [] arr = new int[10];
    int usedSpace;
    int tmp ;
    public void display(){ // 打印表
        if(ifNull()){
            System.out.println("该表为空！" );
            return;
        }
        for (int i = 0; i < this.usedSpace; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }
    public void add(int pos, int data) { //在pos位置添加一个元素
        if (pos < 0 || pos > this.usedSpace){
            System.out.println("pos不合法！");
            return;
        }
        if (ifFull()){ // 如果数组已经满了就扩容
            this.arr = Arrays.copyOf(this.arr,2 * this.arr.length);
        }
        for (int i = this.usedSpace - 1; i >= pos; i--) { // 将前一位赋值给后一位，会留下pos位置等待赋值。
            this.arr[i+1] = this.arr[i];       //">="的原因是pos位置下的元素也要参与移位！
        }
        this.arr[pos] = data;
        this.usedSpace ++;
    }
    public int getPos(int pos){//获取pos位置元素
        if (ifNull()) {
            return -1;
        }
        if (pos < 0 || pos > usedSpace - 1) {
            return -1;
        }
        return this.arr[pos];
    }
    public void setPos(int pos, int value){
        if (ifNull()){
            System.out.println("表为空！");
            return;
        }
        if(pos < 0 || pos > this.usedSpace - 1){
            System.out.println("pos不合法");
            return;
        }
        this.arr[pos] = value;
    }
    public void remove(int toRemove){//删除表中某个元素
        if (ifNull()){
            System.out.println("表为空！");
            return;
        }
        if (contains(toRemove)==false){
            return;
        }
        for (int i = 0; i < this.arr.length - 1; i++) {
            if (toRemove == this.arr[i]){
                 tmp = i;
                break;
            }
        }
        for (int i = tmp; i < this.arr.length - 1; i++) {
            this.arr[i] = this.arr[i+1];
        }
        this.usedSpace--;
    }
    public int size(){//获取表的长度
        if (ifNull()) return 0;
        return this.usedSpace;
    }
    public void clear(){//清空顺序表
        this.usedSpace = 0;
    }
    public boolean contains(int toFind){ // 看toFind这个元素是否在表中
        if (ifNull()) {
            return false;
        }
        for (int i = 0; i < this.usedSpace; i++) {
            if (this.arr[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){//查找toFind元素在表中对应的下标
        if (ifNull()){
            return -1;
        }
        for (int i = 0; i < this.usedSpace; i++) {
            if (toFind == this.arr[i]) return i;
        }
        return -1;
    }
    public boolean ifFull(){//判断表是否已满
        return this.usedSpace == this.arr.length;
    }
    public boolean ifNull(){//判断表是否为空
        return this.usedSpace == 0;
    }
}