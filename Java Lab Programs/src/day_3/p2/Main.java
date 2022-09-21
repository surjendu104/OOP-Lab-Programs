package day_3.p2;


public class Main {
	public static void main(String[] args) {
		Complex num1 = new Complex(5,9);
        Complex num2 = new Complex(10,98);
        
        Complex ans = new Complex();
        ans=ans.add(num1,num2);
        ans.printResult();
        ans=ans.subtract(num1,num2);
        ans.printResult();
        ans=ans.multiply(num1,num2);
        ans.printResult();
        ans=ans.divide(num1,num2);
        ans.printResult();
	}
}
