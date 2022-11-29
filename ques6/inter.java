package ques6;

import java.util.Scanner;

interface add{
    public int addition(int a,int b);
}
interface sub{
    public int Substraction(int a,int b);
}

public class inter implements add,sub{

    public int Substraction(int a, int b) {
        int sub=a-b;
        return sub;
        // TODO Auto-generated method stub
        
    }

    public int addition(int a, int b) {
        int add=a+b;
        return add;
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        inter obj=new inter();
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int expr=obj.addition(a,b)*obj.Substraction(a,b);
        System.out.println(expr);
    }
    
}
