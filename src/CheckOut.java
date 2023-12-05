import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        boolean done = false;
        boolean yn;
        double total = 0;

        do {

            price = InputHelper.getRangedDouble(scan, "Enter the price of an item: ", 0, 10);
            total += price;
            yn = InputHelper.getYNConfirm(scan, "Would you like to continue[y/n]");
            if (yn) {
            }else{
                done = true;
            }
        } while (!done);
        System.out.println("Your total is $" + total);
    }
}
