import java.util.Random;
import java.util.Scanner;

public class LearningMath{
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y); // max
        double absolute = Math.abs(y); //for absolute i.e positive value
        double rounded = Math.round(x); // For upper round, we use Math.ceiling, for lower round we use Math.floor
        System.out.println(z);
        System.out.println(absolute);
        System.out.println(rounded);

//Finding the hypotenuse of a triangle ABC

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the side B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));

        System.out.println("The hypotenuse of the triangle: " + c);
        
// understanding random
        
        Random random = new Random(); // It creates a pseudo random;

        int intX = random.nextInt(); // will print a big values since int can produce -2B, to  2B
        //Pseudo random number means a random number provided with certain mathematics logic behind it.. Thus, not making it true random

        int intY = random.nextInt(6); // will print random number from 0 to 6
        double doubleZ = random.nextDouble(); // will print a long Double value
        boolean booleanA = random.nextBoolean(); // will print either True or False

        System.out.println(intX);
        System.out.println(intY);
        System.out.println(doubleZ);
        System.out.println(booleanA);





    }
}
