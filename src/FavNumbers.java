import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int favint;
        double favdouble;
        favint = InputHelper.getInt(scan, "Enter your favorite intejer:");
        favdouble = InputHelper.getDouble(scan, "Enter your favorite double:");
        System.out.println("Your favorite int is " + favint + " and your favorite double is " + favdouble);
    }
}
