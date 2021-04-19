package Method;

public class BankAccount {
    String accountHolderName;
    String bankName ;
    int accountNumber; // 123456
    String userName ="Julia";
    String password="123";
    double balance;
    boolean isLoggedIn;

    public void SighnUp(String accountHolderName, int accountNumber, String userName, String password, double balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.password = password;
        this.balance = balance;

    }

    public void DisplayInfo() {
        if (isLoggedIn) {
            System.out.println("AccountHolder's Name is: " + accountHolderName + "\nBank name is:" + bankName +
                    "\nAccount Number is:" + accountNumber + "\nUser name is: " + userName +
                    "\nPassword is: " + password + "\nYour current balance is:" + balance +
                    "\nYou are logged in " + isLoggedIn);
        }
    }

    public double deposit(double deposit) {
        balance += deposit;
        System.out.println("This is your new balance after deposit amount: " + balance);
        return balance;
    }

    public double withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance && withdrawAmount >= 0) {
            balance -= withdrawAmount;
            System.out.println("This is your new balance after withdraw " + balance);
        } else {
            System.out.println("You don't have enough money to withdraw");
        }
        return balance;

    }
    public void login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println("You are logged in >>" + isLoggedIn);
        } else {
            System.out.println("Your username or password is wrong");
        }
    }


            public static void main(String[] args) {
        BankAccount batch8 = new BankAccount();
     //   batch8.DisplayInfo();
     //   batch8.deposit(500);
     //   batch8.withdraw(600);
       // batch8.login("Julia","123");
                batch8.SighnUp("Java Bank", 12345, "Julia", "123", 1000);
                //// this will not display the info since we did not log in yet(did not call login method yet)
                batch8.login("Julia", "123"); // we are logging in
                batch8.DisplayInfo();// this will display information since we just logged in
    }
}

