package TestDemo1;
//继承
 class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + " is eating!");
    }
}
class Dog extends Animal {//①子类通过extends关键字来指定父类Animal
    //②java中一个子类只能指定一个父类
    //③子类会继承父类的所有public方法和字段，但父类的 private 的字段和方法, 子类中是无法访问的
    //④子类的实例中, 也包含着父类的实例。 可以使用 super 关键字得到父类实例的引用
    public Dog(String name) {
        super(name);//用super来调用父类的构造方法，此时子类继承了父类的所有public修饰的字段和方法
    }
}
class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }
    public void swim() {//"swim"是鱼特有的方法，可以在子类鱼中单独写出来
        System.out.println(this.name + " is swimming!");
    }
}
public class test {
    public static void main (String args[]) {
        Dog Bob = new Dog("Bob");
        Bob.eat();
        Fish Jerry = new Fish("Jerry");
        Jerry.eat();
        Jerry.swim();
    }
}
//向上转型

