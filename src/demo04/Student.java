package demo04;
//方法的重载
public class Student {
    //成员变量
    private String name;
    private int age;
    //无参数的构造方法
    public Student(){
        System.out.println("无参数构造方法执行");
    }
    //有参数的构造方法
    public Student(String name,int age){
        System.out.println("全参数构造方法执行啦！");
        this.name=name;
        this.age=age;
    }
    //==================================================以上是创建放入数据的步骤
    //Getter,Setter
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int i) {
        this.age=age;
    }
    public int getAge(){
        return  age;
    }

}
