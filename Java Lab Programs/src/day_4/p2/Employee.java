package day_4.p2;

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
class ProductionWorker extends Employee{
    private int shift;
    private double payRate;
    ProductionWorker(String n, String i, String d, int s, double pr){
        super(n,i,d);
        shift = s;
        payRate = pr;
    }
    int getShift(){
        return shift;
    }
    double getPayRate(){
        return payRate;
    }
    void display1(){
        display();
        if(shift == 1)
            System.out.println("Shift: Day");
        else if(shift == 2)
            System.out.println("Shift: Night");
        System.out.println("Hourly Pay Rate: " + payRate);
    }
}
