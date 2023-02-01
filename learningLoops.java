import java.util.Scanner;

public class learningLoops{
    public static void main(String[] args){

        // if else statements = perform a block of code if the condition stated is true
        // checking age for if-else
        Scanner askAge = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = askAge.nextInt();



        if( age>= 75)/* condition */ {
            System.out.println("OK BOOMER!!"); // will execute in order
        }
        else if(age >= 18) {
            System.out.println("You are an adult"); // if this statement was before age>= 75,, for any age above 18.. It will print "You are an adult"
        }
        else if(age >= 13){
            System.out.println("You are a teen");
        }
        else{
            System.out.println("You are a child!");
        }





    }
}
