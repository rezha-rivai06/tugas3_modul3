package After;

/**
 * Interface untuk operasi umum pada rekening tabungan.
 * Mendefinisikan method untuk deposit, penarikan,
 * serta perubahan suku bunga.
 */
public interface Operational {  //ekstrak interface
    // Method to deposit money

    /**
     * Menambah saldo dengan jumlah tertentu.
     *
     * @param amount  jumlah uang yang akan ditambahkan
     */
    void addMoney(double amount);

    // Method to withdraw money

    /**
     * Mengurangi saldo dengan jumlah tertentu.
     *
     * @param amount  jumlah uang yang akan ditarik
     */
    void withdrawMoney(double amount);

    // Method to increase interest rate

    /**
     * Meningkatkan suku bunga.
     *
     * @param rateIncrease  jumlah kenaikan suku bunga
     */
    void increaseInterest(double rateIncrease);

    // Method to decrease interest rate

    /**
     * Menurunkan suku bunga.
     *
     * @param rateDecrease  jumlah penurunan suku bunga
     */
    void decreaseInterest(double rateDecrease);
}
