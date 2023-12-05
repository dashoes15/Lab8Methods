import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp = 0;
        double newTemp;
        newTemp = CtoF(temp);
        System.out.printf("%-13s%7s", "Celcius:", "Farenheight:");
        for (int i = -100; i<=100; i++) {
            temp = i;
            newTemp = CtoF(temp);
            System.out.printf("\n%-13.2f%7.2f", temp, newTemp);
        }


    }
    public static double CtoF(double Celsius){
        // (°F) = (Temperature in degrees Celsius (°C) * 9/5) + 32
        return Celsius*1.8+32;
    }

}
