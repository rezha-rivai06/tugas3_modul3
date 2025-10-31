package Before;

public class SavingRecordBefore {
    public String owner;
    public double balance;
    public double monthlyDeposit;
    public double monthlyWithdraw;
    private double interestRate;
    private static final double MIN_BALANCE = 0;
    private static final double MAX_INTEREST = 0.1;

    public SavingRecordBefore(String owner, double balance, double monthlyDeposit, double monthlyWithdraw, double interestRate) {
        this.owner = owner;
        this.balance = balance;
        this.monthlyDeposit = monthlyDeposit;
        this.monthlyWithdraw = monthlyWithdraw;
        this.interestRate = interestRate;
    }

    // Method to display saving info
    public void dI() {
        System.out.println("Owner Name: " + owner);
        System.out.println("Current Balance: " + balance);
        System.out.println("Monthly Deposit: " + monthlyDeposit);
        System.out.println("Monthly Withdraw: " + monthlyWithdraw);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Estimated Balance (Next Month): " + (balance + (monthlyDeposit - monthlyWithdraw) + (balance * interestRate)));
    }

    // Method to deposit money
    public void addMoney(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        balance -= amount;
        if (balance < MIN_BALANCE) {
            balance = MIN_BALANCE;
        }
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }

    // Method to increase interest rate
    public void incInterest(double rateIncrease) {
        interestRate += rateIncrease;
        if (interestRate > MAX_INTEREST) {
            interestRate = MAX_INTEREST;
        }
        System.out.println("Interest rate increased! Current rate: " + interestRate);
    }

    // Method to decrease interest rate
    public void decInterest(double rateDecrease) {
        interestRate -= rateDecrease;
        if (interestRate < 0) {
            interestRate = 0;
        }
        System.out.println("Interest rate decreased! Current rate: " + interestRate);
    }

    // Method to show full info
    public void showFullInfo() {
        dI();
        System.out.println("------ Summary ------");
        System.out.println("Balance After Adjustments: " + (balance + (balance * interestRate)));
    }

    public static void main(String[] args) {
        SavingRecordBefore mySaving = new SavingRecordBefore("Rezha", 10000000, 2000000, 1000000, 0.05);
        mySaving.showFullInfo();
        mySaving.addMoney(150000);
        mySaving.withdrawMoney(50000);
        mySaving.incInterest(0.02);
        mySaving.decInterest(0.01);
    }
}
