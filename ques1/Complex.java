package ques1;
public class Complex{
    int real, imag;
    Complex(){
    }
    Complex(int tempreal, int tempimag){
            real = tempreal;
            imag = tempimag;
    }
    Complex addComplex(Complex C1, Complex C2){
            Complex temp = new Complex();
            temp.real = C1.real + C2.real;
            temp.imag = C1.imag + C2.imag;
            return temp;
    }
    Complex subComplex(Complex C1, Complex C2){
            Complex temp = new Complex();
            temp.real = C1.real - C2.real;
            temp.imag = C1.imag - C2.imag;
            return temp;
    }
    void Complexprint(){
            System.out.println(real+"+"+imag+"i");
    }
}
class Test{
    public static void main(String args[]){
            Complex C1 = new Complex(4,6);
            Complex C2 = new Complex(3,2);
            Complex C3 = new Complex();
            Complex C4 = new Complex();
            C3=C3.addComplex(C1,C2);
            C4=C4.subComplex(C1,C2);
            System.out.println("Addition of two complex numbers are: ");
            C3.Complexprint();
            System.out.println("Substraction of two complex numbers are: ");
            C4.Complexprint();
    }
}