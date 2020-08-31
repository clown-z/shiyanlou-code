public class People {
//属性（成员变量） 有什么
    double height;  //身高
    int age;     //年龄
    int sex;    //性别，0为男性，非0为女性

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

//方法 干什么
    void cry(){
        System.out.println("我在哭！");
    }
    void laugh(){
        System.out.println("我在笑！");
    }
    void printBaseMes(){
        System.out.println("我的身高是"+height+"cm");
        System.out.println("我的年龄是"+age+"岁");
        if(this.sex==0)
            System.out.println("我是男性！");
        else
            System.out.println("我是女性！");

    }


    //内部类
    public class Student {
        String ID = "20200212";
        int age = 6;
        //内部类方法
        public void stuInfo(){
            System.out.println("访问外部类中的age：" + age);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }

    public static void main(String[] args) {
        People a = new People();
        Student s = a.new Student();
        s.stuInfo();
    }

}