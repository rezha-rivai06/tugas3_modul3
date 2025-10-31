package After;

/**
 * Kelas turunan dari Account yang menyimpan detail rekening tabungan.
 * Mengimplementasikan operasi deposit, penarikan, dan perubahan bunga.
 */
public class SavingRecordAfter extends Account implements Operational {
    private double interestRate;
    private static final double MIN_BALANCE = 0;
    private static final double MAX_INTEREST = 0.1;

    /**
     * Konstruktor untuk inisialisasi objek rekening tabungan.
     *
     * @param accountInfo  objek berisi data akun (nama, saldo, bunga, dll)
     */
    public SavingRecordAfter(AccountInfo accountInfo) {  //introduce parameter objek
        super(accountInfo.owner(), accountInfo.balance(), accountInfo.monthlyDeposit(), accountInfo.monthlyWithdraw());
        this.interestRate = accountInfo.interestRate();
    }

    // Method to display saving info

    /**
     * Menampilkan informasi lengkap rekening dan estimasi saldo bulan depan.
     */
    @Override
    public void displayInfo() {              //Rename method
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Monthly Deposit: " + monthlyDeposit);
        System.out.println("Monthly Withdraw: " + monthlyWithdraw);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Estimated Balance (Next Month): " + calculateNextMonthBalance());  //ekstrak Method
    }


    /**
     * Menghitung estimasi saldo bulan depan berdasarkan deposit, withdraw, dan bunga.
     *
     * @return saldo estimasi bulan berikutnya
     */
    private double calculateNextMonthBalance() {  //ekstrak method
        return currentBalance + (monthlyDeposit - monthlyWithdraw) + (currentBalance * interestRate);
    }

    // Method to deposit money
    @Override
    public void addMoney(double amount) {
        currentBalance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + currentBalance);
    }

    // Method to withdraw money
    @Override
    public void withdrawMoney(double amount) {
        currentBalance -= amount;
        if (currentBalance < MIN_BALANCE) {
            currentBalance = MIN_BALANCE;
        }
        System.out.println("Withdrew: " + amount + ", New Balance: " + currentBalance);
    }

    // Method to increase interest rate
    @Override
    public void increaseInterest(double rateIncrease) {       //Rename method
        interestRate += rateIncrease;
        if (interestRate > MAX_INTEREST) {
            interestRate = MAX_INTEREST;
        }
        System.out.println("Interest rate increased! Current rate: " + interestRate);
    }

    // Method to decrease interest rate
    @Override
    public void decreaseInterest(double rateDecrease) {        //Rename method
        interestRate -= rateDecrease;
        if (interestRate < 0) {
            interestRate = 0;
        }
        System.out.println("Interest rate decreased! Current rate: " + interestRate);
    }

    // Method to show full info

    /**
     * Menampilkan ringkasan informasi rekening.
     */
    public void showFullInfo() {
        displayInfo();
        System.out.println("------ Summary ------");
        System.out.println("Balance After Adjustments: " + (currentBalance + (currentBalance * interestRate)));
    }
}
