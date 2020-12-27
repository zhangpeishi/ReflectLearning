import java.lang.reflect.Field;

/**
 * @author zhangpeishi
 * @apiNote
 * Person的calss对象获取成员变量
 * Field[] getFields
 * Field getField(String name)
 *
 *
 * Field [] getDeclaredFields
 * Field getDeclaredField(String name)
 * 获取完非public 对象后 要想 get 或者set它 必须将Field 对象暴力反射
 *
 */
public class Demo01 {

    public static void main(String[] args) throws Exception{
        //0.获取Person的Class对象
        Class personClass = Person.class;

        //1.获取成员变量 getFields 获取所有public修饰的成员变量

        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);

        }
        System.out.println("---------------------");
//      System.out.println(personClass.getField("a"));//获取指定名字的public修饰的成员变量
        Field field   =  personClass.getField("a");
            //获取成员变量的值
        Person p = new Person();
        Object value = field.get(p);
        System.out.println(value);

        //设置对象的值

        field.set(p, new Integer(5));
        System.out.println(p.a);

        System.out.println("==================================");
        //2.Filed[] getDeclaredFields()
        Field [] fields1  = personClass.getDeclaredFields(); //获取所有的成员变量 不考虑修饰符
        for (Field field1 : fields1) {
            System.out.println(field1);
        }
        Field d = personClass.getDeclaredField("d");//使用非public 成员时，忽略安全检查

        d.setAccessible(true);//暴力反射



        Object value2= d.get(p);
        System.out.println(value2);


    }



}
