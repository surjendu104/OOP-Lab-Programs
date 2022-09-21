package day_3.p5;

public class Payroll {
	    String name;
	    int id;
	    private double rate;
	    private double workedHour;

	    Payroll(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public double getRate() {
	        return rate;
	    }

	    public double getWorkedHour() {
	        return workedHour;
	    }

	    public void setRate(double rate) {
	        this.rate = rate;
	    }

	    public void setWorkedHour(double workedHour) {
	        this.workedHour = workedHour;
	    }

	    double grossPay() {

	        return getRate() * getWorkedHour();
	    }
}
