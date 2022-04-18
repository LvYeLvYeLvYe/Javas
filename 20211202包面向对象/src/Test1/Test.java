package Test1;

class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food) {
        System.out.println("Animal " + this.name + " is eating " + food + "!");
    }
}
class Dog extends Animal {//继承
    public Dog(String name) {
        super(name);//用super来继承
    }
    public void eat(String food) {
        System.out.println("Dog " + this.name + " is eating " + food + "!");
    }
}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void eat(String food) {
        System.out.println("Bird " + this.name + " is eating " + food + "!");
    }
    public void fly() {
        System.out.println("Bird " + this.name + " is flying!");
    }
}
public class Test {//重写
    public static void main(String[] args) {
        Animal animal = new Dog("Lio");
        animal.eat("shit");
        Animal animal1 = new Bird("Dio");
        animal1.eat("coin");
    }
}
