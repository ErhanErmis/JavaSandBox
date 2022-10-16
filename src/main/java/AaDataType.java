public class AaDataType {
    public static void main(String[] args) {
        System.out.println("Hello, We will look at dat type in Java. Let's look at max an min values of data.");


        byte b=2;
        System.out.println("---------------BYTE min & max values-------------------------------");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("----------------------------------------------------------------------");
        short c=2;
        System.out.println("---------------SHORT min & max values-------------------------------");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println("----------------------------------------------------------------------");

        int a=5;
        System.out.println("---------------INT min & max values-------------------------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("----------------------------------------------------------------------");


        long d=2;
        System.out.println("---------------LONG min & max values-------------------------------");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("TYPE CASTING -----> double -> float -> long -> int -> char -> short -> byte");
        /* Java Type Casting
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Widening casting is done automatically when passing a smaller size type to a larger size type:

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        Narrowing casting must be done manually by placing the type in parentheses in front of the value
         */
        short j=1000;
        int i = (j/2); // converting J to int first and calculating
        int k = j; // directly converting J to int and initializing.

        //but in some cases Java could not convert itself
        byte e = 100;
        //byte e= (a/2); if we asked this from Java it gives an error. " is intiger and a/2 should integer but Java could not convert integer to byte.
        byte f = (byte) (a/2); //We need to help to Java like this to convert integer to byte.
        short g= 100;
        byte h =2;
        int l=4;
        long m = g + h + l; // in this example first adding g and h and converting to short then adding l also and converting to integer than its converting to long in final step.

        //normally int is ok in may project but only if we really need to care for storage in big projects, we may use btye or short for an optimum storage usage.

        double n = 5.25;
        double o = 4d; //I can initialize double like these options
        System.out.println("---------------DOUBLE min & max values-------------------------------");
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println("----------------------------------------------------------------------");

        //float p = 5.0; I could take an erros. because Java could not convert double to float it self.
        float p =(float) 5.0;
        float p1= 5f;
        float p2 = 5.2f;// these are the syntax fror float options
        System.out.println("---------------FLOAT min & max values-------------------------------");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println("----------------------------------------------------------------------");

        char ch='A'; //if we use "" instead of '' its taking as String.
        char ch1='£';
        char ch2 ='\u00FD';//https://unicode-table.com/en/#00FD from this page we can take te unicode number and changing first to character to a slash and u and we can use this character.
        System.out.println("A char character sample:" +ch2);


        String s1 = "Hello";
        double d1= 3.32;
        byte b1= 10;
        char c3= '£';
        s1= d1+s1+c3+s1+b1; //if I concatenate d1 and c3 together its converting c3 to couble and givin a number.
        System.out.println("its taking string and concatenate with double and byte:" +s1);
        // in String we can use tab and new line options in concatenate.
        System.out.println("---------------------Tab and new line samples ------------------------------");
        System.out.println("Java\tis\ta\tcoding\tLanguage");
        System.out.println("Java\nis\ta\ncoding\nlanguage");
        System.out.println("**************************************************************************************");

        System.out.println("Integer(10) divided by integer(4) and result giving as integer:"+10/4);
        System.out.println("To be able to take a correct result we need to use one of the value as double(4.0):"+10/4.0);
        System.out.println("Remainder of division operation for 10 and 4 is : "  +(10%4));
        System.out.println("**************************************************************************************");
        int increment=8;
        int decrement =5;
        System.out.println("we can increase value as (increment +=5) or ++increment value =" + ++increment);
        System.out.println("Or Increment++ one unit increasing our value but we can not see it till next run so even we use increament now still our value is: " + increment++);
        System.out.println("but in this line our increment value is "+ increment);
        System.out.println("if we use ++increment instead of increment++ it is directly increasing the value. Decrement operation one unit decreasing our number "+ decrement--);
        System.out.println("Value of decrement is :" +decrement);
        System.out.println("**************************************************************************************");



    }


}
