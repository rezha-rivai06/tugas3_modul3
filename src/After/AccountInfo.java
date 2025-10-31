package After;

/**
 *
 * @param owner            Nama pemilik akun
 * @param balance          saldo awal akun
 * @param monthlyDeposit   Jumlah uang yang disetorkan tiap bulan
 * @param monthlyWithdraw  Jumlah uang yang ditarik tiap bulan
 * @param interestRate     Suku bunga tahunan dalam bentuk desimal
 */
public record AccountInfo( String owner, double balance, double monthlyDeposit, double monthlyWithdraw,
        double interestRate) {
}