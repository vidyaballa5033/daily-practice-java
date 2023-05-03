
class Person{
    String name = "hi";
    int age;
    String gender;

    public void eat(){
        System.out.println("A person eat");
    }

    public void sleep(){
        System.out.println("A person sleep");
    }

    public void walk(){
        System.out.println("A person walk");
    }
}
public class demoObj {

    static int j = 0;
    public static void main(String[] args) {
        j = j++;
        System.out.println(j);
        Person p1 = new Person();
        int i= 10;
        p1.name = "Anil";
        p1.age = 23;
        p1.gender = "Male";
        p1.eat();
        p1.sleep();
        p1.walk();
        System.out.println("Person name is : "+p1.name + " and age is :" + p1.age+ " and gender is : " + p1.gender);
    }

}