package day_3.p3;

public class Box {
	int width;
    int height;
    int depth;
    
    Box(int w,int h,int d){
        width = w;
        height = h;
        depth = d;
    }
    
    int volume(){
        return width*height*depth;
    }
    
    void display(){
        System.out.println("The volume of the box is: "+volume());
    }
    
    void compareVolume(Box b1,Box b2){
        if(b1.volume()>b2.volume())System.out.println("Box1 has greater volume");
        else if(b1.volume()<b2.volume())System.out.println("Box2 has greater volume");
        else System.out.println("Box1 and Box2 has equal volume");
    }
}
