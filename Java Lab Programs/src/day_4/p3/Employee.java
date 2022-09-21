package day_4.p3;

class Employee{
    private String name;
    private String id;
    private String hireDate;
    Employee(String n, String i, String d){
        name = n;
        id = i;
        hireDate = d;
    }
    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
    String getHireDate(){
        return hireDate;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + id);
        System.out.println("Hiring Date: " + hireDate);
    }
}
class ShiftSupervisor extends Employee{
    private double salary;
    private double bonus;
    ShiftSupervisor(String n, String i, String d, double s, double b){
        super(n,i,d);
        salary = s;
        bonus = b;
    }
    double getSalary(){
        return salary;
    }
    double getBonus(){
        return bonus;
    }
    void display1(){
        display();
        System.out.println("Annual Salary: Rs." + salary + "/-");
        System.out.println("Yearly Bonus: Rs." + bonus + "/-");
    }
}