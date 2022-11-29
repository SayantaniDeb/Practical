package folder3;

import java.util.Scanner;
//4/3=1.33
//
public class shape {
    //overloaded for volume sphere,cone,box
    public void Volume(float radius){
        System.out.println(1.33*3.14*radius*radius*radius);
    }
    public void Volume(float radius,float height){
        System.out.println(0.33*3.14*radius*radius*radius);
    }
    public void Volume(float length,float width,float height){
        System.out.println(length*width*height);
    }
}
class Main{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    float radius=in.nextFloat();
    float height=in.nextFloat();
    float length=in.nextFloat();
    float width=in.nextFloat();
    shape obj=new shape();
    obj.Volume(radius);
    obj.Volume(radius,height);
    obj.Volume(length, width, height);
}
}
