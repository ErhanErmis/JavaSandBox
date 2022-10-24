public class L07Methods {
    public static void main(String[] args) {
        /*Notation of a method
        An access modifier(Public,Protected,Private,default)(This is optional) Static/Final ReturnType(Void, String, Int...) FunctionName (Parameters(Optional)){
        Code Block
        }
        Why we need methods. We can need a function more than one place and instead of writing again and again
        we are writing in a place and we are calling it when we need it.
        Example: Many times we are calling print function from system class and out stream function.
        */
        int firstNumber=24, secondNumber=60, thirdNumber=300;
        greeting("James");
        greeting("Jane");
        addition(3,5,9);
        System.out.println("Multiplication of my numbers are: " + multiplication(3,5,2));
        System.out.println("division of my two number is: " + division(6,4));
        addition(multiplication(1,2,3), multiplication(4,5,6),multiplication(2,5,7));
        addition("Jane", "James");
        addition(1.2,2.5);
        addition(2,34,5);
        primeNumbers(11);
        System.out.println("Highest common factor of "+firstNumber+ " and "+secondNumber+" is:"+highestCommonFactor(firstNumber, secondNumber));
        System.out.println("Highest common factor of "+firstNumber+ ", "+secondNumber+" and "+thirdNumber+" is:"+highestCommonFactor(firstNumber, secondNumber,thirdNumber));

    }
    public static void greeting(String name){
        System.out.println(" Hello "+name+ ". Nice to see you again.");
    }

    public static void addition(int a, int b, int c){
        int addition =a+b+c;
        double average = addition/3;
        System.out.println("Addition of "+a+" ,"+b+" and "+c+" is :" +addition + ". Average of these number is: "+average);
    }
    public static int multiplication(int x, int y, int z){
        return (x*y*z);
        //return is a sign of completion of the method. Any code will not run if it is positioned after return word.It is like the break word.
    }
    public static double division(double m, int n){
        return (m/n);
    }
    //method over loading
    public static void addition(double aa,double bb){
        System.out.println("Addition of two decimal numbers ( "+aa+ " and "+bb+ ")is: "+(aa+bb));
    }
    public static void addition(String name, String name2){
        System.out.println("Hello "+ name+ " and "+name2+".");
    }

    public static boolean isPrimeNumber(int num){
        for (int i=2; i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeNumbers(int ourNumber){
        int howManyPrime=0;
        for (int i=2; i<ourNumber;i++){
            if (isPrimeNumber(i)){
                System.out.println(i);
                howManyPrime++;
            }
        }
        System.out.println("There are "+howManyPrime+" prime number in between 1 and "+ourNumber);
    }

    public static int highestCommonFactor(int x, int y){
        int factor=1;

        for (int i=1;i<=x;i++){
            if (x%i==0){
                for (int k=1;k<=y;k++){
                    if (y%k==0){
                        if (k==i){
                            factor=k;
                        }
                    }
                }
            }
        }
        return factor;
    }
    public static int highestCommonFactor(int x, int y, int z){
        int factor=1;
        for (int i=1;i<=x&& i<=y && i<=z;i++){
            if ((x%i==0)&&(y%i==0)&&(z%i==0)){
                            factor=i;
            }
           }
        return factor;
    }

}
