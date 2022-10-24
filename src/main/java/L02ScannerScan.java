import java.util.Scanner;

public class L02ScannerScan {
    public static void main(String[] args) {
        Scanner detail= new Scanner(System.in);
        System.out.println("Enter your name, please:");
        String name=detail.nextLine();
        System.out.println("Enter your age, please:");
        int age = detail.nextInt();
        System.out.println("Enter your height as meter please:");
        double height = detail.nextDouble();

        System.out.println("Dear "+ name + " could you check you details please? ");
        System.out.println("Your age: " +age +" years old");
        System.out.println("Your height: "+ height + " m");

        int number =detail.nextInt();
        detail.nextLine(); //This is a dummy scanner. If we will not use this we can not ask an input for string data.
        //if we need to take next line after next int or next double we need to use this dummy line
        //But if we asked String first we do not need this line.
        String string=detail.nextLine();

    }
}
