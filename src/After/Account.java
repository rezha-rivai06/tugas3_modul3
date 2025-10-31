package After;

/**
 * Kelas dasar yang menyimpan informasi umum akun.
 */
public abstract class Account {  //Ekstrak superclass
    public String ownerName; //Rename Variabel
    public double currentBalance; //Rename Variabel
    public double monthlyDeposit;
    public double monthlyWithdraw;

    /**
     * Konstruktor akun dasar
     *
     * @param ownerName       Nama pemilik
     * @param balance         Saldo awal akun
     * @param monthlyDeposit  Jumlah setoran bulanan
     * @param monthlyWithdraw Jumlah penarikan bulanan
     */
    public Account(String ownerName, double balance, double monthlyDeposit, double monthlyWithdraw) {
        this.ownerName = ownerName;
        this.currentBalance = balance;
        this.monthlyDeposit = monthlyDeposit;
        this.monthlyWithdraw = monthlyWithdraw;
    }

    // Method to display saving info

    /**
     * Menampilkan informasi dasar akun
     */
    public abstract void displayInfo();
}


