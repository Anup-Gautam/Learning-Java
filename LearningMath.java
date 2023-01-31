
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




    }
}
