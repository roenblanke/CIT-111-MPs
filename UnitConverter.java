import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {

        while (true) {
            System.out.println("*********************");
            System.out.println("Please choose the unit conversion you would like to make:");
            System.out.println("1 - miles to meters");
            System.out.println("2 - ponies to fluid ounces");
            System.out.println("3 - pottles to gallons");
            System.out.println("4 - A's -> B's -> C's -> D's");
            System.out.println("*********************");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            switch (selection) {

                case 1:
                    System.out.println("Input the amount of miles to convert to meters.");
                    double mile = scanner.nextDouble();
                    System.out.println(mile + " miles equals " + mileToMeter(mile) + " meters");
                    break;
                case 2:
                    System.out.println("Enter the amount of ponies you want me to convert to fluid ounces.");
                    double ponies = scanner.nextDouble();
                    System.out.println(ponies + " ponies equals " + ponyToFlOz(ponies) + " fluid ounces");
                    break;
                case 3:
                    System.out.println("Enter the amount of pottles you want met to convert to gallons");
                    double pottles = scanner.nextDouble();
                    System.out.println(pottles + " pottles equals " + pottleToGallon(pottles) + " gallons");
                    break;
                case 4:
                    System.out.println("Enter the amount of A's to convert to B's, C's, and D's.");
                    double a = scanner.nextDouble();
                    System.out.println(a + " A's equals " + a2B(a) + " B's, " + b2C(a2B(a)) + " C's, and " + c2D(b2C(a2B(a))) + "D's");
            }//close switch
            //virus download
            //virus();

        }//close while
    }//close main method

    //open miles to meter
    public static double mileToMeter(double miles) {
        double km = miles * 5280 * (1200 / 3937);
        return km;
    }//close miles to km

    //open ponies to fluid ounces
    public static double ponyToFlOz(double pony) {
        double fluidOz = pony * .75;
        return fluidOz;
    }//close ponies to fluid ounces

    //open pottles to gallons
    public static double pottleToGallon(double pottle) {
        double gallons = pottle * .5;
        return gallons;
    }//close pottles to gallons

    //open virus
    public static void virus() {
        for (double numLoops = 0; numLoops < 100; numLoops = numLoops + 0.001) {
            System.out.println("DOWNLOADING VIRUS TO DESKTOP PROGRESS: %" + numLoops);
        }//close for loop
        System.out.println("VIRUS DOWNLOAD COMPLETE");
    }//close virus
    
    public static double a2B(double a){
        double b = a * 2;
        return b;
    }
    public static double b2C(double b){
        double c = b/15;
        return c;
    }
    public static double c2D(double c){
    double d = c * 1.3339;
    return d;
    }
    

}//close class
