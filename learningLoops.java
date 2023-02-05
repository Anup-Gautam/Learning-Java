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
        
        
        Scanner scanner = new Scanner(System.in);
         String name = "";

         //Executing while loop

         while(name.isBlank()){
             System.out.println("Enter your name: ");
             name = scanner.nextLine();
         }
            // There is another variation do... while and this is used if we have to use the code at least once no matter the input
//         do{
//             System.out.println("why you no enter name?");
//         }while(name.isBlank());

        System.out.println("Hello " + name);


         //for loop executes limited number of times
        //for (declaration, condition, spaces){
        // block of code }
        for(int idx = 0; idx <= 10; idx++) {
            System.out.println(idx);
        }

        for(int idx = 10; idx>= 0; idx--){
            System.out.println(idx);
        }

        //nested loops

        Scanner scan = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";

        System.out.println("Enter num of row: ");
        rows = scan.nextInt();
        System.out.println("Enter num of cols: ");
        cols = scan.nextInt();
        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next();

        for(int i = 1; i<= rows; i++) {
            System.out.println(); // linebreak
            for(int j = 1; j<=cols; j++){
                System.out.print(symbol);
            }
        }

    }
}
