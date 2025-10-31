# Program Simulasi Rekening Tabungan

## Deskripsi Program
Program ini merupakan hasil refactoring dari tugas Modul 2.  
Tujuan program ini adalah untuk **mensimulasikan sistem rekening tabungan sederhana**, di mana pengguna dapat:
- Melihat informasi rekening.
- Menambah saldo.
- Melakukan penarikan.
- Menyesuaikan suku bunga (menaikkan atau menurunkan).

Selain itu, program ini juga telah dilengkapi dengan **dokumentasi JavaDoc** untuk setiap kelas dan method.



## Struktur Program

Program ini terdiri dari beberapa kelas dan interface yang saling terhubung:

| Nama File | Jenis | Deskripsi |
|------------|--------|-----------|
| `AccountInfo.java` | `record` | Menyimpan data pemilik rekening seperti nama, saldo awal, setoran bulanan, penarikan bulanan, dan suku bunga. |
| `Operational.java` | `interface` | Mendefinisikan operasi dasar pada rekening seperti menambah saldo, menarik saldo, dan mengubah suku bunga. |
| `SavingRecordAfter.java` | `class` | Kelas utama yang mengelola logika rekening tabungan, menghitung saldo, dan menampilkan informasi. |
| `MainApp.java` | `class` | Kelas yang berfungsi sebagai titik masuk (entry point) untuk menjalankan program. |



## Penjelasan Fitur Utama

1. **Refactoring**
    - Program ini merupakan hasil refactoring dari versi sebelumnya dengan penerapan prinsip OOP dan modularitas.
    - Data pemilik rekening disimpan dalam `record` (`AccountInfo`) agar lebih ringkas dan immutable.

2. **Interface Implementation**
    - Interface `Operational` digunakan untuk mendefinisikan kontrak operasi dasar seperti:
        - `addMoney()`
        - `withdrawMoney()`
        - `increaseInterest()`
        - `decreaseInterest()`

3. **Ekstraksi Method**
    - Method `calculateNextMonthBalance()` diekstrak agar perhitungan saldo lebih terstruktur dan mudah dipahami.

4. **JavaDoc Documentation**
    - Setiap kelas dan method telah dilengkapi dokumentasi JavaDoc yang menjelaskan fungsi, parameter, dan nilai kembalian.



## Contoh Output Program

Owner Name: Rezha
Current Balance: 10000000.0
Monthly Deposit: 2000000.0
Monthly Withdraw: 1000000.0
Interest Rate: 0.05
Estimated Balance (Next Month): 11550000.0
------ Summary ------
Balance After Adjustments: 10500000.0
Deposited: 150000.0, New Balance: 10150000.0
Withdrew: 50000.0, New Balance: 10100000.0
Interest rate increased! Current rate: 0.07
Interest rate decreased! Current rate: 0.06