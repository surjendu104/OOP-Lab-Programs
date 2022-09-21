package day_3.p9;

public class TestScores {
	private int t1, t2, t3;
	 
    public int getT1() {
        return t1;
    }
 
    public int getT2() {
        return t2;
    }
 
    public int getT3() {
        return t3;
    }
 
    public void setT1(int t1) {
        this.t1 = t1;
    }
 
    public void setT2(int t2) {
        this.t2 = t2;
    }
 
    public void setT3(int t3) {
        this.t3 = t3;
    }
 
    double Avarage() {
        return (double) (getT1() + getT2() + getT3()) / 3;
    }
}
