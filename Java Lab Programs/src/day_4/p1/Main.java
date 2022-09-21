package day_4.p1;

public class Main {
	public static void main(String[] args) {
		DepartmentFaculty ob1 = new DepartmentFaculty("RCCIIT","Beliaghata, Canal South Road, Kolkata-700015","Mr. Arup Kumar Bhattacharjee","18 Years of Teaching Experience");
        Department ob2 = new Department("RCCIIT","Beliaghata,Canal South Road,Kolkata-700015","CSE","Mr. Rajib Saha");
        ob1.showFacultyDetails();
        ob2.showDeptDetails();
	}
}	
