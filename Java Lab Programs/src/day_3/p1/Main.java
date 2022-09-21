package day_3.p1;

public class Main {
	public static void main(String[] args){
        StackImplementation st = new StackImplementation();
        st.push(10);
        st.push(12);
        st.push(15);
        System.out.println("Popped element:: "+st.pop());
        
        st.print();
        
    }
}
