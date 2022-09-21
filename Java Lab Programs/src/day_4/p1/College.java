package day_4.p1;

class College{
    String collegeName, addres;
    College(String c, String a){
        collegeName = c;
        addres = a;
    }
    void showDetails(){
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + addres);
    }
}
class DepartmentFaculty extends College{
    String name, experience;
    DepartmentFaculty(String c, String a, String n, String e){
        super(c,a);
        name = n;
        experience = e;
    }
    void showFacultyDetails(){
        showDetails();
        System.out.println("Faculty Name: " + name);
        System.out.println("Experience: " +experience);
    }
}
class Department extends College{
    String deptName, hodName;
    Department(String c, String a, String dn, String hn){
        super(c,a);
        deptName = dn;
        hodName = hn;
    }
    void showDeptDetails(){
        System.out.println("Department: " + deptName);
        System.out.println("HoD Name: " + hodName);
    }
}
