import java.util.Scanner;

/**
 * Created by Graeme on 6/08/2016.
 */
public class ChiliToGo {
    public static void main(String[] args) {
        int adultMeal = 7;
        int childMeal = 4;
        int adultNumber;
        int childNumber;
        //int total = (adultMeal * adultNumber) + (childMeal * childNumber);

        Scanner input = new Scanner(System.in);
        System.out.print("How many adult meals were bought? ");
        adultNumber = input.nextInt();
        System.out.print("How many child meals were bought? ");
        childNumber = input.nextInt();
        System.out.println("Total money made from adult meals are " + "$" + (adultMeal * adultNumber));
        System.out.println("Total money made from child meals are " + "$" + (childMeal * childNumber));
        System.out.println("Total money made " + "$" + ((adultMeal * adultNumber) + (childMeal * childNumber)));

    }
}
