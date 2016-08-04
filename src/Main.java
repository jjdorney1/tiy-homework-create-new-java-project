/**
 * Created by jeffreydorney on 8/3/16.
 */
public class Main {

    public static void main(String[] arg){

    int firstNumber = 440; //Set first int variable to 440
    int secondNumber = 543; //Set second int variable to 543
    int thirdNumber = firstNumber + secondNumber; //Added first and second int variables
    int fourthNumber = secondNumber - firstNumber; //Subtracted first variable from the second
    double fifthNumber = 3.08; //Set the fifth variable to 3.08 a double
    double sixthNumber = firstNumber + fifthNumber; //Set the sixth variable to the first and fifth numbers added together
    double seventhNumber = sixthNumber % fifthNumber; //Set the seventh variable to the remainder of the sixth and fifth variables
    boolean isThisThingOn = true; //Set the eighth variable to true
    boolean areYouSure = false; //Set the ninth to false
    boolean hilariousShenanigans = isThisThingOn || areYouSure; //Set the tenth with an or statement that will return true if at least one is true

        //Prints all the variables with their explanations
    System.out.println("My favorite number is " + firstNumber + ".");
    System.out.println("Another favorite number is " + secondNumber + ".");
    System.out.println("Both added together is " + thirdNumber + ".");
    System.out.println("The difference between the two is " + fourthNumber + ".");
    System.out.println("A cool number that's smaller than pi is " + fifthNumber + ".");
    System.out.println("Adding my two favorite numbers results in " + sixthNumber + ".");
    System.out.println("The remainder between the past two results is " + seventhNumber + ".");
    System.out.println("True or false - this program works: " + isThisThingOn + ".");
    System.out.println("True or false - are you sure?: " + areYouSure + ".");
    System.out.println("True or false - this program is pretty ridiculous, right?: " + hilariousShenanigans + ".");

    }
}
