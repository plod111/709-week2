import java.util.Scanner;

public class vendingreciever {
    /**
     * Version 1 of vendingreceiver file.
     * HW Week 2 CSCI 70900 
     * 
     * @author B.Cornish
     * @collaborator any_partner_you_worked_with
     */

    /**
     * 2. The program should set up an empty variable for the amount of money placed
     * in the machine by the user. (Initially, none.)
     *
     * 3. The program should prompt "Please enter a coin :>".
     * 
     * 4. The program should then accept any of the following letters: P (penny), N
     * (nickel), D (dime), Q (quarter), H (half dollar), G (golden dollar coin). The
     * machine should accept input of either case (i.e., upper or lower).
     *
     * 5. The program should update the machine's balance with what was entered by
     * the user.
     *
     * 6. The program should print: "Your balance is []." The [] should be replaced
     * by a properly formatted $ amount using decimals.
     *
     * 7. Only one coin is to be dropped in at this point.
     *
     * 8. This is revision one of the program.
     *
     * 9. Also generate the Javadoc for this version of the program.
     *
     * 10. Push the source code and documentation to your Github repository.
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String moneyIn;

        double balance = 0.0;

        System.out.print("Please enter a coin : ");

        moneyIn = in.next();

        //System.out.println("Coin in: " + moneyIn);

        switch (moneyIn) {

            case ("p"): // penny
                balance = 0.01;
                break;
            case ("P"): // penny
                balance = 0.01;
                break;
            case ("n"): // nickel
                balance = 0.05;
                break;
            case ("N"): // nickel
                balance = 0.05;
                break;
            case ("d"): // dime
                balance = 0.10;
                break;
            case ("D"): // dime
                balance = 0.10;
                break;
            case ("q"): // quarter
                balance = 0.25;
                break;
            case ("Q"): // quarter
                balance = 0.25;
                break;
            default: System.out.println("Invalid Coin Entered");
        }

        System.out.printf("Your balance is $%.2f\n", balance);

        in.close();
    }
}
