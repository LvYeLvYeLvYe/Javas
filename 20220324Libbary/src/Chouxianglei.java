abstract class element{//抽象类，不能实例化，要想使用其抽象方法只能实例化其子类然后让子类重写抽象类中的抽象方法
    abstract public void name();//抽象方法没有具体的方法内容，不能用private修饰
    int i = 10;//抽象类中可以有其他的非抽象方法和字段
}//抽象类存在的最大意义就是为了被继承
class fire extends element {//fire是element(元素)的子类
    @Override//重写
    public void name() {
        System.out.println("火");
    }
}
class water extends element {
    @Override
    public void name() {
        System.out.println("水");
    }
}
public class Chouxianglei {
    public static void main(String[] args) {
        element element1 = new fire();
        element1.name();
        element element2 = new water();
        element2.name();
    }
}
/*
普通的类也可以被继承， 普通的方法也可以被重写呀，为啥非得用抽象类和抽象方法呢?
答：使用抽象类相当于多了一重编译器的校验：
使用抽象类的场景就如上面的代码， 实际工作不应该由父类完成， 而应由子类完成。
那么此时如果不小心误用成父类了，使用普通类编译器是不会报错的。 但是父类是抽象类就会在实例化的时候提示错误，让我们尽早发现问题。*/
