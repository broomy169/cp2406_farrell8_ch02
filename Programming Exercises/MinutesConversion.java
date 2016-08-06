import java.util.Scanner;

/**
 * Created by Graeme on 6/08/2016.
 */
public class MinutesConversion {
    public static void main(String[] args) {
        float minutesInHours = 60;
        float minutesInDays =  1440;
        int inputNum;

        Scanner input = new Scanner(System.in);
        System.out.print("Minutes: ");
        inputNum = input.nextInt();
        System.out.println(inputNum + " minutes is equal to " + String.format("%.2f", inputNum/minutesInHours) +
                            " hours and " + String.format("%.2f",inputNum/minutesInDays) + "days");
    }
}
