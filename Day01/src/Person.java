public class Person {
    private String name;
    private int age;

    public int a;
    protected int b;
    int c;
    private int d;
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age){
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public void eat(){
        System.out.println("eat方法被执行了");
    }
    public void eat(String food){
        System.out.println("eat"+food+"方法被执行了");
    }

}
