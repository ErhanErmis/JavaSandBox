import java.util.Scanner;

public class L04ConditionalSituations {
    public static void main(String[] args) {
        //Task: asking three numbers and finding the biggest one
        Scanner scan =new Scanner(System.in);
        System.out.print("enter a number:");
        int firstNumber=scan.nextInt();
        System.out.print("enter another number:");
        int secondNumber=scan.nextInt();
        System.out.print("enter your last number:");
        int lastNumber= scan.nextInt();
        int theBiggestNumber=0;
//        if(firstNumber<secondNumber){
//           theBiggestNumber=secondNumber;
//             if (secondNumber<lastNumber){
//                theBiggestNumber=lastNumber;}
//        }else {
//            theBiggestNumber=firstNumber;
//        }
//        System.out.println("the biggest number you provides is:" +theBiggestNumber);



        //Second approach,
        if(firstNumber>=secondNumber && firstNumber>=lastNumber){
            theBiggestNumber=firstNumber;
        }else if (secondNumber>=firstNumber && secondNumber>=lastNumber){
            theBiggestNumber=secondNumber;
        }else {
            theBiggestNumber=lastNumber;
        }
        System.out.println("the biggest number you provides is:"+theBiggestNumber);
    }
}
