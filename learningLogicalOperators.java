import java.util.Scanner;

public class learningLogicalOperators {
    public static void main(String[] args) {
        //logical operators AND(&&) OR(||) NOT(!)
        //AND operator
        Scanner tempScan = new Scanner(System.in);
        System.out.println("What's the temperature outside in C");
        double temp = tempScan.nextDouble()

        if(temp > 30 ){
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }

        //OR Operator

        Scanner gameChecker = new Scanner(System.in);
        System.out.println("You are playing a game press q or Q to quit");
        String response = gameChecker.next();

        if (response.equals("q") || response.equals("Q")){
            System.out.println("Fi FI FO Fum FI is that a quitter I see!");
        }
        else{
            System.out.println("There is nothing to play!! SIKE!!!");
        }

        //NOT operator
        if (!response.equals("q") && !response.equals("Q")){ // for NOT operator use ! in the beginning to use .equals but in use != to work in arithmetic operator
            System.out.println("There is nothing to play!! SIKE!!!");
        }
        else{
            System.out.println("Fi FI FO Fum FI is that a quitter I see!");
        }

    }
}
