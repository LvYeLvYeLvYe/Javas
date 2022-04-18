class Hero {//包含属性(字段、成员变量) 方法
    //属性：
    public String name;
    public int price;//非静态成员变量不能赋值，它是属于对象的
    public String sex;
    public String race;
    public static int a = 100;//如果加了static那就是静态成员变量,可以赋值，它是属于类的
    public final int c = 100;
    //方法：
    public  void attack() {//成员方法
        System.out.println(name + " is attacking!");
    }
    public Hero(String name, int price, String sex, String race){//这是构造方法，和所处的类同名，作用是构造对象，可以有多个-
        this.name = name;//this：指向当前对象的引用
        this.price = price;//this是与对象绑定在一块的，在静态方法中不能使用this
        this.sex = sex;
        this.race = race;
    }
}
public class TestDemo {
    public String grade;
    public static void main(String[] args) {
        Hero timo =new Hero("Timo",6300,"femal","Yodel");
        timo.attack();
        timo.a++;
        System.out.println(timo.a);//静态成员变量a=101
        Hero dema = new Hero("Dema",3200,"femal","human");
        dema.a++;
        System.out.println(dema.a);//静态成员变量a=102
    }
}