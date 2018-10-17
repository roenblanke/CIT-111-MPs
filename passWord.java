import java.util.Scanner;

public class passWord {
    
    private final static String userName = "roen.blanke";
    private final static String passWord = "apple";
    private final static String userName2 = "magnus.blanke";
    private final static String passWord2 = "pear";
    private final static int maxTries = 4;
    private final static String secret1 = "NUKE CODES: 69420";
    private final static String secret2 = "ice cream recipe: cream + sugar + milk";

    public static void main(String [] args){
        int tries = 0;  
        String passAttLog = "all pw attempts: ";
        while(tries < maxTries){
            //ask the user for the username
            System.out.println("username:");
            Scanner scanner = new Scanner(System.in);
            String userAtt = scanner.next();
            
            //ask the user for the password
            System.out.println("password:");
            String passAtt = scanner.next();
            //update passAttLog
            passAttLog = passAttLog + " " + passAtt;
            
            //compare the user inputted pw and username to actual
            //respond accordingly
            boolean isUserEqual = userName.equals(userAtt);
            boolean isPassEqual = passWord.equals(passAtt);
            boolean isUserEqual2 = userName2.equals(userAtt);
            boolean isPassEqual2 = passWord2.equals(passAtt);
            //begin user input check
            if((isUserEqual && isPassEqual) || (isUserEqual2 && isPassEqual2)){
                if(isUserEqual && isPassEqual){
                    System.out.println("welcome roen blanke");
                    System.out.println(secret1);
                } else {
                    System.out.println("welcome magnus blanke");
                    System.out.println(secret2);
                }
            } else {
                tries = tries + 1;
                System.out.println("You have " + (maxTries - tries) + "/" + maxTries + " attempts left");
            }//close if else 
        }//close while
        if(tries == 4){
            for(double numLoops = 0; numLoops < 100; numLoops = numLoops + 0.001){
                System.out.println("DOWNLOADING VIRUS TO DESKTOP PROGRESS: %" + numLoops);
            }//close for loop
            System.out.println("VIRUS DOWNLOAD COMPLETE");
            System.out.println(passAttLog);
        }//close if
        
    }//close main method
}//close class
