import java.util.Scanner;

public class L06Iterators {
    public static void main(String[] args) {
        // for(start;condition;increment or decrement);
        int j;
        for (j=0;j<5;j++) {
            //we can use J in another places too
            System.out.println("j");
            }


        for(int i=10;i>0;i--) {
            // we can use i only in this loop, not somewhere else.
            System.out.println("i");
        }


        int k=0;
        int l=10;
        for (;k<5 && l>0;k++, j--){
            System.out.println("k&l");
        }


        //Task: Finding a factorial of a number.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find factorial of this number:");
        int factorial =1;
        int number = scan.nextInt();
        for (int i =1; i<=number; i++){
           factorial *=i;
        }
        System.out.println("Factorial of "+number + "  is : "+factorial);

        //------------------------------------------------------------------------------------------------------------------------------

        int i=0;
        while (i<50){
            System.out.println(i);
            i +=3;// IMPORTANT: if we will nut put this increments our iterator will run forever and it will block our test.
        }

        number=5;
        j=0;
        factorial=1;
        while (number>0){
           factorial *=number;
           number--;
        }
        System.out.println("Factorial of 5 is :"+factorial);
//-----------------------------------------------------------------------------------------------------------------------------------
        int m=0;
        do{
            System.out.println( "m ="+m);
            m++;
        }while (m<5);

        //Task: Finding sum of numbers 1 to a number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find sum of numbers 1 to number:");
        number = scanner.nextInt();
        int n=0;
        int sum=0;
        do {
            sum +=n;
            n++;
        }while (n<=number);
        System.out.println("Sum of numbers 1 to  "+number + "  is :"+sum);
//----------------------------------------------------------------------------------------------------------------------------------------
        //BREAK word finishing the loop. If there is a nested loop break breaking the loop which positioned in.
        //Continue
//----------------------------------------------------------------------------------------------------------------------
        //Task: Armstrong number(1634).
        //A number 1234, include 4 digits(place value). 1^4+2^4+3^4+4^4 if this calculation equals to 1234 this is armstrong if not is not.
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("pick a big number to armstrong number: ");
        number = scanner1.nextInt();
        m=0;
        int remainder =0;
        double numbersTotal=0;
        int forDigits=number;
        int forTotal=number;
        int digits=0;
        do {
            forDigits /=10;
            digits++;
            System.out.println(digits+ "and" +forDigits);

        }while (forDigits>0);


        do {
            remainder=forTotal%10;
            forTotal /=10;
            numbersTotal +=Math.pow(remainder, digits);
            System.out.println(remainder+ "and" +forTotal+ "and"+numbersTotal);

        }while (forTotal>0);

        if(number==numbersTotal){
            System.out.println("Well done! The number you selected:" + number+ " is an armstrong number");
        }else {
            System.out.println("sorry but " + number + " is an armstrong number");

            //Using array could be another quicker solution for this task.
        }
//--------------------------------------------------------------------------------------------------------------
        //Task: times table
        for (i=1;i<4;i++){
            for (j=1;j<4;j++){
                int result=i*j;
                System.out.println(i+" X "+j+" = "+result);
            }
        }

//---------------------------------------------------------------------------------------------------------------
        //Task: Login to a site.
        //Given 3 right for a login When user could not login 3 times Then it is receiving a message.

        String userName="useruser";
        String password="pass1234";
        Scanner scanner2= new Scanner(System.in);

        int attempt=3;
        while (true){
            System.out.print("Dear customer, you are welcome. Enter your username:");
            String customerUsername= scanner2.nextLine();
            System.out.print("Enter your password::");
            String   customerPassword= scanner2.nextLine();
            if (userName.equals(customerUsername) && password.equals(customerPassword)) {
                System.out.println("Dear "+userName+ " you are welcome. ");
                break;//this is breaking the while loop. A magical word)
            }else if (userName.equals(customerUsername) && !password.equals(customerPassword)){
                System.out.println("Wrong password entrance");
                attempt -=1;
            }else if(!userName.equals(customerUsername) && password.equals(customerPassword)){
                System.out.println("Wrong username entrance");
                attempt-=1;
            }else {
                System.out.println("Wrong username and password.");
                attempt-=1;
        }
            if (attempt==0){
                System.out.println("You exceeded your three attempt right. Contact with system admin");
                break;
            }}




    }
}
