class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;
    public ListNode(int val) {
        this.val = val;
    }
}
public class MyLinkedlist {
    public ListNode head;//头节点
    public ListNode last;//尾节点
    public void display() {//打印链表
        ListNode cur = this.head;
        if (this.head == null) {
            System.out.println("链表为空！");
            System.out.println();
            return;
        }
        while (cur != null) {
            System.out.print(cur.val +" ");
            cur=cur.next;
        }
    }
    public void addFirst(int data) {//头插法
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.head.prev = node;
            node.next = this.head;
            this.head = node;
        }
    }
    public void addLast(int data) {//尾插法
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    public void addIndex(int index, int data) {//index处插入数据
        if (index < 0 || index > size()) {
            System.out.println("index不合法");
            return;
        }
        ListNode cur = this.head;
        ListNode node = new ListNode(data);
        int count = 0;
        while (cur != null) {
            if (index == 0) {//当index在0处插入时用头插法
                addFirst(data);
                return;
            }
            if (index == size()) {//当index在size()处插入时用头插法
                addLast(data);
                return;
            }
            if (count == index) {////当index在中间处处插入时用如下方法
                node.prev = cur.prev;
                node.next = cur;
                cur.prev = node;
                node.prev.next = node;
            }
            count ++;
            cur = cur.next;
        }

    }
    public boolean contains(int key) {//是否存在key
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public void remove(int key) {//删除首次出现的key的节点
        if (this.head == null) {
            System.out.println("链表为空！");
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur == this.head && cur.val == key) {//当首次出现的key在head时
                this.head = this.head.next;
                this.head.prev = null;
                return;
            }
            if (cur == this.last && cur.val == key) {//当首次出现的key在last时
                this.last = this.last.prev;
                this.last.next = null;
                return;
            }
            if (cur.val == key) {//当首次出现的key在中间时
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                return;
            }
            cur = cur.next;
        }
        System.out.println("没有这个元素！");
    }
    public void removeAllkey(int key) {//删除所有的key
        if (this.head == null) {
            System.out.println("链表为空！");
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur == this.head && cur.val == key) {//当出现的key在head时
                this.head = this.head.next;
                this.head.prev = null;
            }
            else if (cur == this.last && cur.val == key) {//当出现的key在last时
                this.last = this.last.prev;
                this.last.next = null;
            }
            else if (cur.val == key && cur !=this.head && cur != this.last) {//当出现的key在中间时
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
            cur = cur.next;
        }
    }
    public int size() {//返回链表长度
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public void clear() {
        ListNode cur = this.head;
        ListNode curNext = cur.next;
        while (curNext != null) {
            cur.prev = null;
            cur.next = null;
            cur = curNext;
            curNext = cur.next;
        }
        this.head = null;
        this.last.prev = null;
    }
}
