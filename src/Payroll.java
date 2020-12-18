import java.util.*;
class Employee {
    int empid;
    long mobile;
    String name, address, mailid;
    Scanner get = new Scanner(System.in);
    void getData() {
        System.out.println("Enter Name of the Employee");
        name = get.nextLine();
        System.out.println("Enter Mail id");
        mailid = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();
        System.out.println("Enter employee id ");
        empid = get.nextInt();
        System.out.println("Enter Mobile Number");
        mobile = get.nextLong();
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id : " + empid);
        System.out.println("Mail id : " + mailid);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobile);
    }
}
class Programmer extends Employee {
    double bp, da, hra, pf, club, net, gross;
    void getProgrammer() {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateProg() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("************************************************");
        System.out.println("Basic Pay:Rs" + bp);
        System.out.println("DA:Rs" + da);
        System.out.println("PF:Rs" + pf);
        System.out.println("HRA:Rs" + hra);
        System.out.println("CLUB:Rs" + club);
        System.out.println("GROSS PAY:Rs" + gross);
        System.out.println("NET PAY:Rs" + net);
    }
}
class AssistantProfessor extends Employee {
    double bp, da, hra, pf, club, net, gross;
    void getAsst() {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateAsst() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("************************************************");
        System.out.println("Basic Pay:Rs" + bp);
        System.out.println("DA:Rs" + da);
        System.out.println("HRA:Rs" + hra);
        System.out.println("PF:Rs" + pf);
        System.out.println("CLUB:Rs" + club);
        System.out.println("GROSS PAY:Rs" + gross);
        System.out.println("NET PAY:Rs" + net);
    }
}
class AssociateProfessor extends Employee {
    double bp, da, hra, pf, club, net, gross;
    void getAssociate() {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateAssociate() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("************************************************");
        System.out.println("Basic Pay:Rs" + bp);
        System.out.println("DA:Rs" + da);
        System.out.println("HRA:Rs" + hra);
        System.out.println("PF:Rs" + pf);
        System.out.println("CLUB:Rs" + club);
        System.out.println("GROSS PAY:Rs" + gross);
        System.out.println("NET PAY:Rs" + net);
    }
}
class Professor extends Employee {
    double bp, da, hra, pf, club, net, gross;
    void getProfessor() {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateProfessor() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("************************************************");
        System.out.println("PAY SLIP FOR PROFESSOR");
        System.out.println("************************************************");
        System.out.println("Basic Pay:Rs" + bp);
        System.out.println("DA:Rs" + da);
        System.out.println("HRA:Rs" + hra);
        System.out.println("PF:Rs" + pf);
        System.out.println("CLUB:Rs" + club);
        System.out.println("GROSS PAY:Rs" + gross);
        System.out.println("NET PAY:Rs" + net);
    }
}
public class Payroll {
    public static void main(String args[]) {
        int choice, cont;
        do {
            System.out.println("PAYROLL");
            System.out.println(" 1.PROGRAMMER \t 2.ASSISTANT PROFESSOR \t 3. ASSOCIATEPROFESSOR\t 4. PROFESSOR ");
            Scanner c = new Scanner(System.in); choice = c.nextInt();
            switch (choice) {
                case 1:
                {
                    Programmer p = new Programmer();
                    p.getData();
                    p.getProgrammer();
                    p.display();
                    p.calculateProg();
                    break;
                }
                case 2:
                {
                    AssistantProfessor asst = new AssistantProfessor();
                    asst.getData();
                    asst.getAsst();
                    asst.display();
                    asst.calculateAsst();
                    break;
                }
                case 3:
                {
                    AssociateProfessor asso = new AssociateProfessor();
                    asso.getData();
                    asso.getAssociate();
                    asso.display();
                    asso.calculateAssociate();
                    break;
                }
                case 4:
                {
                    Professor prof = new Professor();
                    prof.getData();
                    prof.getProfessor();
                    prof.display();
                    prof.calculateProfessor();
                    break;
                }
            }
            System.out.println("Do u want to continue 0 to quit and 1 to continue "); cont = c.nextInt();
        }
        while (cont == 1);
    }
}