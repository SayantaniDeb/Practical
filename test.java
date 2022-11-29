import java.util.Scanner;
import one.two.D;
class Test extends D{

    public void area(int a){
        System.out.println(a*a);
    }

public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Test obj=new Test();
        System.out.println("Enter two numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("their multiplication is: ");
        obj.multiply(a,b);
        System.out.println("Display the sentence");
        String c=in.next();
        obj.display(c);
        System.out.println("Area of number A: ");
        obj.area(a);
        System.out.println("Substraction: ");
        obj.substract(a,b);
        in.close();
    }
}
