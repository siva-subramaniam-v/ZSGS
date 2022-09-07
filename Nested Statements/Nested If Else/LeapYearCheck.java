import java.util.Scanner;

class LeapYearCheck {
    static boolean isLeapyear (int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
        }

        if (year % 100 == 0) {
            if (year % 400 == 0)
                return true;
            else
                return false;
        }

        return false;
    }
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        input.close();

        if (isLeapyear(year))
            System.out.println(year + " is a leap year");
        else
        System.out.println(year + " is not a leap year");
    }
}