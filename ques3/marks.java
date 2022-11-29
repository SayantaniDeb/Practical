package ques3;

import java.util.Scanner;
class myexception extends Exception{
    myexception(String s){
        super(s);
    }
}
public class marks{
    public static void main(String[] args) throws myexception {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a>100){
            throw new myexception("Marks should be within 100");

        }
        else
        System.out.println("Marks: "+a);
        in.close();
    }
}
