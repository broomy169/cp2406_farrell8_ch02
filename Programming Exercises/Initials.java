import java.util.Scanner;

/**
 * Created by Graeme on 6/08/2016.
 */
public class Initials {
    public static void main(String[] args) {
        char firstInitial ;
        char middleInitial;
        char lastInitial;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name?");
        firstInitial = Character.toUpperCase(input.next().charAt(0));
        System.out.print("What is your middle name?");
        middleInitial = Character.toUpperCase(input.next().charAt(0));
        System.out.print("What is your last name?");
        lastInitial = Character.toUpperCase(input.next().charAt(0));
        System.out.print("Your initials are " + firstInitial + "."
                            + middleInitial + "." + lastInitial + ".");

    }
}
