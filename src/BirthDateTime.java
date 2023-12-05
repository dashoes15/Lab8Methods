import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        int day;
        int year;
        int hours;
        int minutes;

        month = InputHelper.getRangedInt(scan, "Enter your birth month:", 1, 12);
        year = InputHelper.getRangedInt(scan, "Enter your birth year", 1995, 2023);
        hours = InputHelper.getRangedInt(scan, "Enter your birth hour", 0, 24);
        minutes = InputHelper.getRangedInt(scan, "Enter your birth minute", 0, 60);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12) {
            day = InputHelper.getRangedInt(scan, "Enter your birth day", 1, 31);
        }else if(month == 2){
            day = InputHelper.getRangedInt(scan, "Enter your birth day", 1, 28);
        }else{
            day = InputHelper.getRangedInt(scan, "Enter your birth day", 1, 30);
        }
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
        System.out.println("Hour: " + hours);
        System.out.println("Minute: " + minutes);
    }
}
