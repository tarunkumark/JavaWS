import java.util.ArrayList;
import java.util.Scanner;
public class StringOps {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        System.out.println(a);
        int choice;
        int run = 1;
        String s;
        Scanner in = new Scanner(System.in);
        while (run > 0) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1. Enter String");
            System.out.println("2. Enter Index and string to Insert");
            System.out.println("3. Enter string to Search");
            System.out.println("4. Enter beginning text");
            System.out.println("5. Exit");
            System.out.println("Enter Choice: ");
            choice = in .nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter String: ");
                    s = in .next();
                    a.add(s);
                    System.out.println(a);
                    System.out.println("---------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Enter Index and string to Insert: ");
                    int index = in .nextInt();
                    s = in .next();
                    a.add(index, s);
                    System.out.println(a);
                    System.out.println("---------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Enter string to Search: ");
                    s = in .next();
                    System.out.println(a.contains(s));
                    System.out.println("---------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Enter beginning text: ");
                    String c = in .next();
                    for (int i = 0; i < a.size(); i++) {
                        if (((String) a.get(i)).startsWith(c)) {
                            System.out.println(a.get(i));
                        }
                    }
                    System.out.println("---------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Exitting.......");
                    System.exit(0);
                default:
                    System.out.println("Enter correct Choice");
                    break;
            }
        }
    }
}