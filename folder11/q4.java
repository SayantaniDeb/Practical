class A extends Thread {

  public void run() {
    System.out.println("A");
  }
}

class B extends Thread {

  public void run() {
    System.out.println("B");
  }
}

class C extends Thread {

  public void run() {
    System.out.println("C");
  }
}

class q4 {
public static void main(String args[]) {
    A a = new A();
    B b = new B();
    C c = new C();
    a.setPriority(Thread.MAX_PRIORITY);
    b.setPriority(Thread.NORM_PRIORITY);
    c.setPriority(Thread.MIN_PRIORITY);
    a.start();
    b.start();
    c.start();    
  }
}
