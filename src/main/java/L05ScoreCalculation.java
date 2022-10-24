import java.util.Scanner;

public class L05ScoreCalculation {
    public static void main(String[] args) {
        /*
        Calculate the pass rate according to exam result. First Exam-->30%, Second exam-->30%, Final exam-->40%
        result>=90 --> AA
        result>=85 --> BA
        result>=80 --> BB
        result>=75 --> CA
        result>=70 --> CC
        result>=65 --> DC
        result>=60 --> DD
        result>=55 --> FD
        result<55  --> FF
        Provide some advice for lover grades.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your fist exam score:");
        int firstScore= scanner.nextInt();
        System.out.print("Enter your second exam score:");
        int secondScore= scanner.nextInt();
        System.out.print("Enter your final exam score:");
        int finalScore= scanner.nextInt();
        double result= (firstScore*0.3+secondScore*0.3+finalScore*0.4);
        if (result>=90){
            System.out.println("You had: AA. Well done.Your result is:"+result);
        }else if(result<90 && result>=85){
            System.out.println("You had: BA.Your result is:"+result);
        }else if(result<85 && result>=80){
            System.out.println("You had: BB.Your result is:"+result);
        }else if(result<80 && result>=75){
            System.out.println("You had: CB.Your result is:"+result);
        }else if(result<75 && result>=70){
            System.out.println("You had: CC.Your result is:"+result);
        }else if(result<70 && result>=65){
            System.out.println("You had: DC.This is not enough for a direct pass.Your result is:"+result);
        }else if(result<65 && result>=60){
            System.out.println("You had: DD.This is not enough for a direct pass.Your result is:"+result);
        }else if(result<60 && result>=55){
            System.out.println("You had: FD.You failed.Your result is:"+result);
        }else{
            System.out.println("You had: FF. You failed. Your result is:"+result);}


    }
}
