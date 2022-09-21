package day_3.p4;

public class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age = age;
    }
    void compare(Person p1,Person p2){
        if(p1.age>p2.age)System.out.println(p1.name+" is older and his age is "+p1.age);
        else if(p1.age<p2.age)System.out.println(p2.name+" is older and his age is "+p2.age);
        else System.out.println(" Both have same age ");
    }
    
    
}