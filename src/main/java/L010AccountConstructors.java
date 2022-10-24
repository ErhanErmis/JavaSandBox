public class L010AccountConstructors {
    private int accountNo;
    private double balance;
    private String Name;
    private String email;
    private String phone;
//I asked to intellij to genarate something and asked constructer with all variable. By this way I can easily call this function
//in test method with variables with a one single line.
//We can create many different constructer with method over riding.
    public L010AccountConstructors(int accountNo, double balance, String name, String email, String phone) {
        this.accountNo = accountNo;
        this.balance = balance;
        Name = name;
        this.email = email;
        this.phone = phone;
    }
    public void showAccountDetails(){
        System.out.println("Accont No: "+this.accountNo);
        System.out.println("Balance :"+this.balance);
        System.out.println("Name: "+this.Name);
        System.out.println("email: "+this.email);
        System.out.println("Phone number: "+this.phone);
    }
    public void payin(double amount){
        balance+=amount;
        System.out.println("You paid "+amount+"and your new balance is:£"+balance);
    }
    public void payout(double amount){
        if (!(amount>300)){


            if (balance<amount){
                System.out.println("Insufficient amount. You current balance is: £"+balance);
            }else {
                balance-=amount;
                System.out.println("You payout £"+amount+" and your new balance is: £"+balance);}
        }else {System.out.println("Please enter a valid amount. You can take maximum £300 per day.");}

    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
