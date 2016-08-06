import java.text.Format;
import java.util.Scanner;

/**
 * Created by Graeme on 6/08/2016.
 */
public class ChiliToGoProfit {
    public static void main(String[] args) {
        double adultProfit = (7 - 4.35);
        double childProfit = (4 - 3.10);
        int adultNumber;
        int childNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("How many adult meals were bought? ");
        adultNumber = input.nextInt();
        System.out.print("How many child meals were bought? ");
        childNumber = input.nextInt();
        System.out.println("Total profit made from adult meals are " + "$" + String.format("%.2f",adultProfit * adultNumber));
        System.out.println("Total profit made from child meals are " + "$" + String.format("%.2f",childProfit * childNumber));
        System.out.println("Total profit made " + "$" + String.format("%.2f",(adultProfit * adultNumber) + (childProfit * childNumber)));

    }
}
