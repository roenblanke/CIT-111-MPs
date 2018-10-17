//we will use this scanner to get the answer from the user
import java.util.Scanner;

//the rng method will let us generate random questions everytime
import java.util.Random;

public class appropriately {

    public static void main(String[] args) {
        //this is the users failed tries
        int wrongAns = 0;
        
        //the max number of questions the user will recieve
        int totalQuestions = 15;
        
        //the number of questions the user has responded to
        int questionsAnswered = 0;
        
        //upper end of the rng
        int upEnd = 4;
        
        //user score will be adjusted as they answer questions and posted at
        //the end of the quiz
        int userScore = 0;
        
        //begin while loop
        while (wrongAns < 3 && questionsAnswered < totalQuestions) {
        
            //the pieces for genning a random prob
            Random rng = new Random();
            int randNum1 = rng.nextInt(upEnd);
            int randNum2 = rng.nextInt(upEnd);
            int answer = randNum1 * randNum2;
            String mathProb = randNum1 + " * " + randNum2 + " = ?";
            
            //invite the user to solve the problem
            System.out.println();
            System.out.println("Compute this problem:");
            System.out.println(mathProb);

            //this is the scanner that will take in user data
            Scanner scanner = new Scanner(System.in);
            //this variable ill store the user input
            int userInput = scanner.nextInt();

            //comparison of userInput to answer
            //and then give the appropriate response
            if (userInput == answer) {
                System.out.println();
                //adjust the userScore according to difficulty
                //if the user gets a harder question incorrect they should not
                //lose as many points as they would if they got an easier 
                //question incorrect and i do not know how to make the math 
                //reflect that
                userScore = userScore + (upEnd / 2);
                upEnd = upEnd + 4;
                questionsAnswered = questionsAnswered + 1;
                if (questionsAnswered < totalQuestions) {
                    System.out.println("That's corect, keep going!");
                }
            } else if (userInput < answer) {
                System.out.println("Too low");
                System.out.println("The answer was: " + answer);
                wrongAns = wrongAns + 1;
                if (wrongAns < 3) {
                    System.out.println("Try again!");
                }
                //adjust the userScore according to difficulty 
                //of incorrectly answered question
                userScore = userScore - (upEnd / 2);
                upEnd = upEnd - 2;
                questionsAnswered = questionsAnswered + 1;
            } else if (userInput > answer) {
                System.out.println("Too high");
                System.out.println("The answer was: " + answer);
                wrongAns = wrongAns + 1;
                if (wrongAns < 3) {
                    System.out.println("Try again!");
                }
                //adjust the userScore according to difficulty 
                //of incorrectly answered question
                userScore = userScore - (upEnd / 2);
                upEnd = upEnd - 2;
                questionsAnswered = questionsAnswered + 1;
            }//close if else chain
            
        }//close while loop

        //if they run out of tries the while loop will 
        //cease and they will be given the correct response
        if (wrongAns == 3) {
            System.out.println("Too many wrong! Bye bye!");
        }//close if
        
        System.out.println("Your Score is: " + userScore);
        
    }//close main method

}//close class
