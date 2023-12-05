import java.util.Scanner;
public class GetUsername {
    public static void main(String[] args) {
        //To use inputhelper you must call inputhelper.method
        Scanner scan = new Scanner(System.in);
        String username;
        username = InputHelper.getNonZeroString(scan, "Enter a username:");
        System.out.println(username);
    }
}
