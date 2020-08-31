public class Dog extends Animal{

    public int age;

    //子类重写父类的bark方法
    public void bark(){
        System.out.println("汪汪汪");
    }

    //子类自己的方法
    public void dogType() {
        System.out.println("这是什么品种的狗？");
    }

}
