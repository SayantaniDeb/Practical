package folder2;

import java.util.Scanner;

class Room {
    
    void Area(int a,int b){
        int area=a*b;
        System.out.println(area);
    }
}
class ClassRoom extends Room
{
    void Volume(int a,int b,int c){
        int vol=a*b*c;
        System.out.println(vol);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // int c = Integer.parseInt(args[2]);
        ClassRoom obj1=new ClassRoom();
        obj1.Area(a,b);
        obj1.Volume(a,b,c);

}
}
