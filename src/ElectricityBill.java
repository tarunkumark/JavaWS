import java.util.*;
class calculateBill extends Object {
    int cno;
    String cname;
    long units, prev, cur;
    String type;
    double billpay;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the previous reading ");
        prev=sc.nextLong();
        System.out.println("Enter the current reading");
        cur = sc.nextLong(); System.out.println("Enter the type of Connection");
        type = sc.next(); System.out.println("Enter the consumer Number");
        cno = sc.nextInt(); System.out.println("Enter the Consumer Name");
        cname = sc.next();
        units = cur - prev;
        if (type.equalsIgnoreCase("domestic"))
            bill_dom(units);
        else
            bill_com(units); display();
    }
    void display() {

        System.out.println("Name" + " " + cname);
        System.out.println("Number" + " " + cno);
        System.out.println("Bill to pay" + " " + billpay);

    }
    void bill_dom(long units) {
        if (units < 100)
            billpay = units * 1;
        else if (units < 200)
            billpay = 100 * 1 + (units - 100) * 2.50;
        else if (units < 500)
            billpay = 100 * 1 + 100 * 2.50 + (units - 300) * 4;
        else
            billpay = 100 * 1 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;
    }
    void bill_com(long units) {
        if (units < 100)
            billpay = units * 2;
        else if (units < 200) billpay = 100 * 2 + (units - 100) * 4.50;
        else if (units < 500)
            billpay = 100 * 2 + 100 * 4.50 + (units - 300) * 6;
        else
            billpay = 100 * 2 + 100 * 4.50 + 300 * 6 + (units - 500) * 7;
    }
}
public class ElectricityBill {
    public static void main(String[] args) {
        calculateBill obj = new calculateBill();
        obj.getdata();
    }
}