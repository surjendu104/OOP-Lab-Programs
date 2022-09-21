package day_3.p2;

public class Complex{
    int real;
    int imaginary;
    Complex(int tempReal,int tempImaginary){
        this.real=tempReal;
        this.imaginary = tempImaginary;
    }
    //Empty constructor
    Complex(){}
    
    Complex add(Complex c1,Complex c2){
        Complex temp = new Complex();
        
        temp.real = c1.real+c2.real;
        temp.imaginary = c1.imaginary+ c2.imaginary; 
        return temp;
    }
    Complex subtract(Complex c1,Complex c2){
        Complex temp = new Complex();
        
        temp.real = c1.real-c2.real;
        temp.imaginary = c1.imaginary- c2.imaginary; 
        return temp;
    }
    Complex multiply(Complex c1,Complex c2){
        Complex temp = new Complex();
        
        temp.real = c1.real*c2.real;
        temp.imaginary = c1.imaginary* c2.imaginary; 
        return temp;
    }
    Complex divide(Complex c1,Complex c2){
        Complex temp = new Complex();
        
        temp.real = c1.real/c2.real;
        temp.imaginary = c1.imaginary/ c2.imaginary; 
        return temp;
    }
    
    void printResult(){
        System.out.println("Complex number is : "+real+"+ ("+imaginary+"i)");
    }
    
}