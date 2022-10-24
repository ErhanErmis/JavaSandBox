import java.util.Scanner;

public class L02ChangeInTwoVariables {
    public static void main(String[] args) {
        Scanner details = new Scanner(System.in);
        System.out.println("Enter the weight of item in your right hand as decimal in KG:");
        double right = details.nextDouble();
        System.out.println("Enter the weight of item in your left hand as decimal in KG:");
        double left = details.nextDouble();
        System.out.println("Change the item left to right and right to left)");
        double changePlace=right;
        right=left;
        left=changePlace;

        System.out.println("you have: "+right +"kg in your right hand and you have: "+ left+ "kg in your lefty hand");
    }
}
