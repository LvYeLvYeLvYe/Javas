import javafx.scene.chart.ValueAxis;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int value) {
        this.val = value;
    }
}
public class MyArrayList {
    ListNode head;
    public void display() {//打印
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void addHead(int value) {//头插法
        ListNode cur = new ListNode(value);//不用判断链表是否为空，因为引用链表时已经创建了一个head空节点。
        cur.next = this.head;
        this.head = cur;
    }
    public void addTail(int value) {//尾插法
        ListNode node = new ListNode(value);//创建一个节点node存储要插入的数据
        if (this.head == null) {//链表为空时直接把node当作头节点；
            this.head = node;
            return;
        }
        ListNode cur = this.head;//创建cur节点来代替head遍历整个链表，停止条件为指向空(next == null)；
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    public boolean contains(int key) {//判断key是否存在于链表中
        if (this.head == null) {//表为空直接返回false
            return false;
        }
        ListNode cur = this.head;
        while (cur.next != null) {//遍历链表判断key
            if (key == cur.val) {
                return true;
            }
            cur = cur.next;
        }
        return false;//遍历完了都没有直接返回false
    }
    public int size() {//链表的长度
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public ListNode findLastOne(int pos) {//找到要替换元素的前驱
        int flag = 0;
        ListNode cur = this.head;
        while (flag != pos - 1){
            cur = cur.next;
            flag++;
        }
        return cur;
    }
    public void addPos(int value, int pos) {//为pos位置添加一个元素
        while (pos < 0 || pos >= size()){
            System.out.println("位置不合法！");
            return;
        }
        if (pos == 0) {
            addHead(value);
            return;
        }
        if(pos+1 == size()) {
            addTail(value);
            return;
        }
        int flag = 0;
        ListNode node = new ListNode(value);
        ListNode cur = findLastOne(pos);
        node.next = cur.next;
        cur.next = node;
    }
    public void remove(int key) {//删除第一次遇到的key
        if(this.head == null) {
            System.out.println("链表为空无法删除！");
            return;
        }
        ListNode cur = this.head;
        if (cur.val == key) {//关键字在头节点时直接将下一个节点设置为头节点
            this.head = cur.next;
            return;
        }
        while (cur.next != null) {
            if (cur.next.val == key) {
                cur.next = cur.next.next;//直接跳过中间的节点，将两边的节点连起来
                return;
            }
            cur = cur.next;
        }
        System.out.println("没有找到这个元素");
        return;
    }
    public void  removeAllKey(int key) {//删除链表中所有值为key的节点
            if (this.head == null) {
                System.out.println("链表为空！");
                return;
            }
            ListNode prev = this.head;//创建一个前驱节点，便于删除包含key的节点(即cur)。
            ListNode cur = prev.next;//创建一个后驱节点，用来删除key
            while (cur.next != null) {//当cur的next为空时就到了最后一个节点
                if (cur.val == key) {//如果cur的值等于key就删除它（当cur接收到含key的节点时才会进入这个判断）
                    prev.next = cur.next;//删除语句
                    cur = cur.next;//cur指向下一个
                }else {//否则prev移动到cur的位置并且把cur往后移（当cur没有接收到不含key的节点时才会进入这个判断）
                    prev = cur;
                    cur = cur.next;
                }
            }
            if(this.head.val == key) {//最后再来判断头节点是否包含key
                this.head = this.head.next;
                return;
            }
        System.out.println("没有包含这个元素");
    }
    public void clear() {
        this.head = null;
    }
}
