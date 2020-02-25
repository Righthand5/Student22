package demo04;
//这样的话set不就没有用了吗？因为年龄不可能总是岁所以还是需要setter的，构造是初始化的。
public class Demo01Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        System.out.println("=================");
        Student stu2=new Student("aaaaa",20);
        System.out.println("name:"+stu1.getName()+",年龄："+stu2.getName());
        stu1.setAge(21);
        System.out.println("name:"+stu1.getName()+",年龄："+stu2.getName());
    }
}
