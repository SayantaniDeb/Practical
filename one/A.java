package one;

public class A extends B implements C {
    public void multiply(int a,int b){
        System.out.println(a*b);
    }

    @Override
    public void area(int a) {
        // TODO Auto-generated method stub
        
    }

    
}
class B {
    public void display(String c){
        System.out.println(c);
    }
}
interface C{
    public void area(int a);
        
}


