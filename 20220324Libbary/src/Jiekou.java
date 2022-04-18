import java.sql.SQLOutput;

interface Ishape {//接口命名要用I开头，接口只能有抽象方法和静态常量
    void draw();//这是一个抽象方法，主要作用是被重写
}
class Cycle implements Ishape {//Cycle使用implements继承接口，表示实现
    @Override//重写
    public void draw() {
        System.out.println("⭕");
    }
}
//以下将实现多个接口：
class Animal {//父类：Animal
    protected String name;

    public Animal (String name) {
        this.name = name;
    }
}
interface Ifly {//三个不同接口
    void fly();
}
interface Irun {
    void run();
}
interface Iswim {
    void swim();
}
class horse extends Animal implements Irun {
    public horse (String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在跑！");
    }
}
class dog extends Animal implements Irun,Iswim {
    public dog (String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在跳！");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在游泳！");
    }
}
class duck extends Animal implements  Irun,Iswim,Ifly {
    public duck (String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在跑！");
    }
    @Override
    public void fly() {
        System.out.println(this.name + "正在飞！");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在游泳！");
    }
}
public class Jiekou {
    public static void main(String[] args) {
        Ishape shape = new Cycle();
        shape.draw();//完成了接口的使用
        Irun horse = new horse("小马一号");
        horse.run();
        Irun dog = new dog("小狗一号");
        dog.run();
        Irun duck = new duck("小鸭一号");
        duck.run();
    }
}
/*      使用 interface 定义一个接口
        接口中的方法一定是抽象方法，因此可以省略 abstract
        接口中的方法一定是 public ，因此可以省略 public
        Cycle 使用 implements 继承接口。此时表达的含义不再是 “扩展”， 而是 “实现”
        在调用的时候同样可以创建一个接口的引用，对应到一个子类的实例
        接口不能单独被实例化
        从jdk1.8开始，接口中的普通
        方法可以有具体实现，但这个方法必须是default修饰的。*/
