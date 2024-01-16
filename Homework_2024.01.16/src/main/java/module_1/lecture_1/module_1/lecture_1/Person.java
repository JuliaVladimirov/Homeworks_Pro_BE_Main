package module_1.lecture_1.module_1.lecture_1;

public class Person {

    String fullName;
    int age;

    public void move(){
        System.out.println("Person by name " +  fullName + " is moving");
    }
    public void talk(){
        System.out.println("Person by name " +  fullName + " is talking");
    }

    public Person(){
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
}
