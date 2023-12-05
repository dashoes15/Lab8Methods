import java.util.Scanner;

public class RegExMagic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn;
        String mNumber;
        String userChoice;

        ssn = InputHelper.getRegExString(scan, "Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println(ssn);
        mNumber = InputHelper.getRegExString(scan, "Enter your UC mNumber: ", "(M|m)\\d{5}");
        System.out.println(mNumber);
        userChoice = InputHelper.getRegExString(scan, "Menu: O - Open | S - Save | V - View | Q - Quit", "[OoSsVvQq]");
        System.out.println("You choose:" + userChoice);

    }
}
