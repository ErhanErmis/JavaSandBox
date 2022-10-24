import java.util.Scanner;

public class L02HypotenuseCalculation {
    public static void main(String[] args) {
        //In this task ask to user the sides of a right angle triangle and calculate the hypotenuse of this triangle

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the length of one side of the triangle in cm:");
        int firstSide= scan.nextInt();
        System.out.println("Enter the length of the other side of the triangle in cm:");
        int secondSide= scan.nextInt();
        double hypotenuse =(Math.sqrt((Math.pow(firstSide,2))+Math.pow(secondSide,2)));
        System.out.println(Math.pow(firstSide,2));
        System.out.println(Math.pow(secondSide,2));
        System.out.println((Math.pow(firstSide,2))+Math.pow(secondSide,2));
        System.out.println(Math.sqrt(25));
        System.out.println("one side is: "+firstSide+" cm and the other side is "+secondSide +" cm.");
        System.out.println("Hypotenuse of this right angle triangle is" +hypotenuse + " cm.");
    }


}
