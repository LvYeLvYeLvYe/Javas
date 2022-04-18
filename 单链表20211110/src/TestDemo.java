public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addTail(12);
        myArrayList.addTail(3);
        myArrayList.addTail(12);
        myArrayList.addTail(19);
        myArrayList.addTail(12);
        myArrayList.addHead(15);
        System.out.println(myArrayList.contains(12));
        System.out.println(myArrayList.size());
        myArrayList.addPos(66,0);
        myArrayList.remove(30);
        myArrayList.removeAllKey(5);
        //myArrayList.clear();
        myArrayList.display();
    }
}
