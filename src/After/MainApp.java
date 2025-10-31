package After;

/**
 * Kelas utama untuk menjalankan simulasi rekening tabungan.
 * Menampilkan informasi akun, melakukan deposit, penarikan,
 * serta perubahan bunga.
 */
public class MainApp {

    /**
     * Titik masuk utama program.
     *
     * @param args  argumen command line (tidak digunakan)
     */
    public static void main(String[] args) { //move Method
        SavingRecordAfter mySaving = new SavingRecordAfter(new AccountInfo("Rezha", 10000000, 2000000, 1000000, 0.05));
        mySaving.showFullInfo();
        mySaving.addMoney(150000);
        mySaving.withdrawMoney(50000);
        mySaving.increaseInterest(0.02);
        mySaving.decreaseInterest(0.01);
    }
}
