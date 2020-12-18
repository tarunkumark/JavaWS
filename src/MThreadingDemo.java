import java.util.*;
class Even implements Runnable {
    public int x;
    public Even(int x) {
        this.x = x;
    }
    public void run() {
        System.out.println("Thread Name: Even Thread and " + x + "is even Number and Square of " + x +
                " is: " + x * x);
    }
}
class Odd implements Runnable {
    public int x;
    public Odd(int x) {
        this.x = x;
    }
    public void run() {
        System.out.println("Thread Name: ODD Thread and " + x + " is odd number and Cube of " + x + " is:"+x*x*x);
    }
}
class A extends Thread {
    public String tname;
    public Random r;
    public Thread t1, t2;
    public A(String s) {
        tname = s;
    }
    public void run() {
        int num = 0;
        r = new Random();
        try {
            for (int i = 0; i < 50; i++) {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generate Number is " + num);
                if (num % 2 == 0) {
                    t1 = new Thread(new Even(num));
                    t1.start();
                } else {
                    t2 = new Thread(new Odd(num));
                    t2.start();
                }
                Thread.sleep(1000);
                System.out.println("------------------------------------------------");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
public class MThreadingDemo {
    public static void main(String[] args) {
        A a = new A("One");
        a.start();
    }
}