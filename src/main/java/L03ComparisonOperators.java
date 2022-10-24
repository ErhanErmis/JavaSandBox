public class L03ComparisonOperators {
    public static void main(String[] args) {
        /*
                    *********************COMPARISON OPERATORS*********************
                    ---------------------------------------------------------------------
                    || Operator    ||         Name                        Example     ||
                    ---------------------------------------------------------------------
                    ||   ==        ||     Equal to                     a==b           ||
                   ---------------------------------------------------------------------
                    ||   !=        ||     Not equal                    a!=b           ||
                   ---------------------------------------------------------------------
                    ||    >        ||     Greater than                 a>b            ||
                   ---------------------------------------------------------------------
                    ||   <         ||     Less than                    a<b            ||
                    ---------------------------------------------------------------------
                    ||    >=       ||     Greater than or equal to     a>=b           ||
                    ---------------------------------------------------------------------
                    ||   <=        ||     Less than or equal to        a<=b           ||
                   ---------------------------------------------------------------------
                   * *******************************************************************

         */

        System.out.println("1."+(1<3));
        System.out.println("2."+(3==5));
        System.out.println("3."+(24!=5));
        System.out.println("4."+("True"=="True"));

        /*
                     *********************LOGICAL OPERATORS*********************
                    ---------------------------------------------------------------------
                    || Operator    ||         Name                  ||       Example   ||
                    ---------------------------------------------------------------------
                    ||   &&       ||     both true                  ||      a=5 && b>3 ||
                   ---------------------------------------------------------------------
                    ||   ||        ||     at least one of them true ||      a=5 || b>3 ||
                   ---------------------------------------------------------------------
                    ||   !        ||     opposite result            ||    !(a=5 && b>3)||
                    ---------------------------------------------------------------------
                   * *******************************************************************

         */

        System.out.println("5."+(1<3 && 3==5));
        System.out.println("6."+(1<3 || 3==5));

    }
}