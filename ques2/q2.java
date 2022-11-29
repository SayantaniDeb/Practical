package ques2;
import java.util.Scanner;

public class q2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Rectangle rectangle = new Rectangle();
    System.out.println("Enter the length of the rectangle: ");
    rectangle.setLength(input.nextDouble());
    System.out.println("Enter the width of the rectangle: ");
    rectangle.setWidth(input.nextDouble());
    System.out.println(
      "The perimeter of the rectangle is: " + rectangle.perimeter()
    );
    System.out.println("The area of the rectangle is: " + rectangle.area());
  }
}

class Rectangle {

  private double length;
  private double width;

  public Rectangle() {
    length = 0;
    width = 0;
  }

  public void setLength(double length) {
    if (length > 0.0 && length < 20.0) {
      this.length = length;
    } else {
      System.out.println("Length must be greater than 0 and less than 20");
      System.exit(0);
    }
  }

  public void setWidth(double width) {
    if (width > 0.0 && width < 20.0) {
      this.width = width;
    } else {
      System.out.println("Width must be greater than 0 and less than 20");
      System.exit(0);
    }
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public double perimeter() {
    return 2 * (length + width);
  }

  public double area() {
    return length * width;
  }
}
