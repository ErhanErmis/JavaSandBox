public class TestOfL010 {
    public static void main(String[] args) {
        //int accountNo, double balance, String name, String email, String phone
        L010AccountConstructors accountConstructors=new L010AccountConstructors(1234,820.50,"Jane","jane@gmail.com","123456");
        accountConstructors.showAccountDetails();
        accountConstructors.payin(345.20);
        accountConstructors.payout(259.00);
        accountConstructors.payout(352.00);
        accountConstructors.payout(259.00);
        accountConstructors.payout(259.00);
        accountConstructors.payout(259.00);
        accountConstructors.payout(259.00);


    }
}
