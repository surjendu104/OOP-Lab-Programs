package day_4.p4;

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
class TeamLeader extends ProductionWorker{
    private double bonus;
    private double requiredTrainingHrs;
    private double attendedTrainingHrs;
    TeamLeader(String n, String i, String d, int s, double pr, double b, double rq, double at){
        super(n,i,d,s,pr);
        bonus = b;
        requiredTrainingHrs = rq;
        attendedTrainingHrs = at;
    }
    double getBonus(){
        return bonus;
    }
    double setRequiredTrainingHrs(){
        return requiredTrainingHrs;
    }
    double setAttendedTrainingHrs(){
        return attendedTrainingHrs;
    }
    void display2(){
        display1();
        System.out.println("Monthly Bonus: Rs." + bonus + "/-");
        System.out.println("Required Training Hours: " + requiredTrainingHrs);
        System.out.println("Attended Training Hours: " + attendedTrainingHrs);
    }
}