package spittr.config;

/**
 * @ClassName Reflection
 * @Description
 * @Author martind
 * @Date 2018/8/8 9:45
 **/
public class Reflection {
    public static void main(String[] args){

        Student stu = new Student();
        Class stuClass = stu.getClass();
        System.out.println(stuClass.getName());
        Class stuClass1 = Student.class;
        System.out.println(stuClass1);
    }
}
