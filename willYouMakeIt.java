import java.util.Scanner;

public class week4Mp {

    //were gonna need some user input
    //open main method
    public static void main(String[] args) {

        //These are the self explanatory double variables
        double milesPerGallon;
        double gasInTank;
        double milesToGasStation;

        //Now, we make a scanner object to take in userInput
        Scanner userInputScanner = new Scanner(System.in);

        //ask the user what kind of mileage their car gets
        System.out.println("How many miles does your car get to the gallon?");
        //adjust the mpg var accordingly
        milesPerGallon = userInputScanner.nextDouble();
        //check that the user did not enter 0 or a negative number
        if (milesPerGallon == 0) {
            System.out.println("Please enter a number greater than 0");
            milesPerGallon = userInputScanner.nextDouble();
        } else if (milesPerGallon < 0) {
            System.out.println("Please enter a positive number");
            milesPerGallon = userInputScanner.nextDouble();
        }//close if else

        //Now we ask the user what they have in the tank
        System.out.println("How many gallons are in the tank?");
        //adjust the gasInTank var according to there answer
        gasInTank = userInputScanner.nextDouble();
        //check that the user did not enter 0 or a negative number
        if (gasInTank < 0) {
            System.out.println("Please enter a number greater than or equal to 0");
            gasInTank = userInputScanner.nextDouble();
        } //close if

        //Now we ask how many miles left to the next gas station
        System.out.println("How many miles to the next gas station");
        //adjust the miles to gas station variable accordingly
        milesToGasStation = userInputScanner.nextDouble();

        //compare gas in tank times mpg to miles to next station
        //the user is given a response based on ther situation
        if ((milesPerGallon * gasInTank) > milesToGasStation + 0.25) {
            System.out.println("******FINAL ANALYSIS******");
            System.out.println("You'll make it!");
            System.out.println("You'll have " + ((milesPerGallon * gasInTank) - milesToGasStation) / milesPerGallon + " gallons to spare.");
            System.out.println("You could go another: ");
            System.out.println(milesPerGallon * gasInTank - milesToGasStation + " mile(s)");
        } else if ((milesPerGallon * gasInTank) == milesToGasStation) {
            System.out.println("******FINAL ANALYSIS******");
            System.out.println("You're running on fumes, but you will make it!");
            System.out.println("You will have no gas left over.");
        } else {
            System.out.println("******FINAL ANALYSIS******");
            System.out.println("You do not have enough gas to make it!");
            System.out.println("You will be " + (milesToGasStation - milesPerGallon * gasInTank) + " miles away from the gas station.");
            System.out.println("You would need another " + (milesToGasStation / milesPerGallon - milesPerGallon * gasInTank) + " gallons to make it");
            System.out.println("However, if you could reach a MPG of " + milesToGasStation / gasInTank + " then you would make it to the gas station");
            System.out.println("Good luck!");
        }//close if else 
        System.out.println("You are welcome");
    }//close main method

}//close class
