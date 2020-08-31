
public class Test {
    public static void main(String[] args) {
        Animal am = new Animal();
        Dog a = new Dog();

        Animal b = new Dog();
        a.legNum = 4;
        a.age = 2;
        am.bark();
        a.bark();
        b.bark();
        a.dogType();
        //a.dogType();//编译不通过
    }
}