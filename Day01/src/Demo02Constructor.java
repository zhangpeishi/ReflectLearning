import java.lang.reflect.Constructor;
/**
 *@author zhangpeishi
 * Person的calss对象获取构造方法
 * 获取的构造方法对象有 创建Object 对象的功能
 * 什么样的构造方法对象 创建什么样参数的Object 对象
 * 如果创建空参的构造器，用来创建空参的对象，那么有一个快捷方式，不用 用构造器对象创建空参对象
 * 直接用 personClass.newInstance();方法就可以创建
 *
 */
public class Demo02Constructor {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class personClass = Person.class;
//        Constructor c = personClass.getConstructor(String.class,int.class);
        Constructor c = personClass.getConstructor();

        System.out.println(c);
        //创建对象
//        Object person  = c.newInstance("zhangsan",23);
//        System.out.println(person);
        System.out.println("---------------------");
        Object person1 = c.newInstance();
        System.out.println(person1);
        Object person3 = personClass.newInstance();

    }

}
