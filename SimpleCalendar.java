import java.util.Scanner;
import java.util.Calendar;

public class SimpleCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int startDay = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("\nSun Mon Tue Wed Thu Fri Sat");
        for (int i = 1; i < startDay; i++) System.out.print("    ");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay - 1) % 7 == 0) System.out.println();
        }
        sc.close();
    }
}
