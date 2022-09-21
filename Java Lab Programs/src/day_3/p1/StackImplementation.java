package day_3.p1;

public class StackImplementation{
    static int MAX=1000;
    int[] a=new int[MAX];
    int top;
    boolean isEmpty(){
        return (top<0);
    }
    
    StackImplementation(){
        top=-1;
    }
    
    void push(int x){
        if(top>=(MAX-1))
            System.out.println("Satck overflow");
        else{
            a[++top]=x;
            System.out.println("Pushed: "+x);
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
            }
        else {
            int x;
            x=a[top--];
            //System.out.println(x+" poped from stack");
            return x;
        }
    }
    
    void print(){
        for(int i=top;i>-1;i--){
        System.out.print(a[i]+" ");
        }
    }
}
