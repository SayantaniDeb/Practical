package folder6;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the digits: ");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Given array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("Array in ascending order");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Array in descending order: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

        
    }
}
