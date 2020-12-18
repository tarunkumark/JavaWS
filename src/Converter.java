import currencyconversion.Currency;
import distanceconversion.Distance;
import timeconversion.TimeConverter;

import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice, ch;
        Currency c = new Currency();
        Distance d = new Distance();
        TimeConverter t = new TimeConverter();
        do {
            System.out.println("1. dollar to rupee");
            System.out.println("2. rupee to dollar");
            System.out.println("3.Euro to rupee");
            System.out.println("4..rupee to Euro");
            System.out.println("5. Yen to rupee");
            System.out.println("6. Rupee to Yen");
            System.out.println("7. Meter to kilometer");
            System.out.println("8. kilometer to meter");
            System.out.println("9. Miles to kilometer");
            System.out.println("10. kilometer to miles");
            System.out.println("11. Hours to Minutes");
            System.out.println("12. Hours to Seconds");
            System.out.println("13. Seconds to Hours");
            System.out.println("14. Minutes to Hours");
            System.out.println("Enter ur choice");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                {
                    c.dollarToRupee();
                    break;
                }
                case 2:
                {
                    c.rupeeToDollar();
                    break;
                }
                case 3:
                {
                    c.euroToRupee();
                    break;
                }
                case 4:
                {
                    c.rupeeToEuro();
                    break;
                }
                case 5:
                {
                    c.yenToRupee();
                    break;
                }
                case 6:
                {
                    c.rupeeToYen();
                    break;
                }
                case 7:
                {
                    d.mToKm();
                    break;
                }
                case 8:
                {
                    d.kmToM();
                    break;
                }
                case 9:
                {
                    d.milesToKm();
                    break;
                }
                case 10:
                {
                    d.kmToMiles();
                    break;
                }
                case 11:
                {
                    t.hoursToMinutes();
                    break;
                }
                case 12:
                {
                    t.hoursToSeconds();
                    break;
                }
                case 13:
                {
                    t.secondsToHours();
                    break;
                }
                case 14:
                {
                    t.minutesToHours();
                    break;
                }
            }
            System.out.println("Enter 0 to quit and 1 to continue");
            ch = s.nextInt();
        } while (ch == 1);
    }
}