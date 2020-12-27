import java.lang.reflect.Method;

/**
 *
 * 获取成员方法
 * 1.执行方法 Object invoke(Object obj,Object……args)//传参数
 * 2.获取方法名称：String getName
 *
 *
 */

public class Demo03Method {
    public static void main(String[] args) throws Exception{

        Class personClass = Person.class;
//        Method[] methods = personClass.getMethods();
//        System.out.println(methods);
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        eat_method.invoke(p);
        Method eat_method2 = personClass.getMethod("eat",String.class);

        eat_method2.invoke(p,"饭");
        //获取所有public修饰的方法
        Method[] methods= personClass.getMethods();
        for (Method method : methods) {
//            System.out.println(method);
//            System.out.println(method.getName());
//            method.setAccessible(true);//支持暴力反射
        }
        //获取类名
        String className = personClass.getName();
        System.out.println(className);
    }


}
