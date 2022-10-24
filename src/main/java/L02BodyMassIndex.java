import java.util.Scanner;

public class L02BodyMassIndex {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Could you enter your name please:");
        String name=input.nextLine();
        System.out.println("Could you enter your weight please as kg:");
        double weight =input.nextDouble();
        System.out.println("Could you enter your height please as meter:");
        double height =input.nextDouble();

        double BMI= weight/(height*height);
        System.out.println("Dear "+name +" your BMI is: "+BMI);


        //Challenge
        if (BMI<18.5){
            System.out.println("Your BMI is lover than average. Arrange an appointment with your GP");
        }else if (18.5<=BMI && BMI<25.0){
            System.out.println("Your reading seems good. Have a nice day");
        }else if (25.0<=BMI && BMI< 30.0){
            System.out.println("Your BM is slightly higher than average. Care for your diet and exercises please.");
        }else{
            System.out.println("Your reading shows that you are above the averages. Arrange an appointment with your GP as soon as possible.");
        }
    }
}
