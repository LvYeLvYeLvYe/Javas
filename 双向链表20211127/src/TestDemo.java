public class TestDemo {
    public static void main(String[] args) {
        MyLinkedlist myLinkedlist = new MyLinkedlist();
/*        myLinkedlist.addFirst(12);
        myLinkedlist.addFirst(2);
        myLinkedlist.addFirst(11);
        myLinkedlist.addFirst(6);*/
        myLinkedlist.addLast(1);
        myLinkedlist.addLast(2);
        myLinkedlist.addLast(3);
        myLinkedlist.addLast(15);
        myLinkedlist.addLast(2);
/*        System.out.println(myLinkedlist.contains(5));
        myLinkedlist.removeAllkey(2);
        myLinkedlist.addIndex(2,9);*/
        myLinkedlist.clear();
        System.out.println(myLinkedlist.size());
        myLinkedlist.display();
    }
}