# Aplikasi ATM Sederhana

## Deskripsi
Aplikasi ATM sederhana ini dibuat menggunakan bahasa pemrograman Java. Aplikasi ini memiliki beberapa fungsionalitas dasar, seperti melihat saldo, setor uang, dan tarik uang. Untuk memastikan fungsionalitas aplikasi, unit test telah dibuat menggunakan framework TestNG.

## Fungsionalitas

### Kelas `ATM`
Kelas `ATM` memiliki atribut saldo dan beberapa metode utama:
- **`double lihatSaldo()`**: Mengembalikan saldo saat ini.
- **`void setorUang(double jumlah)`**: Menambah saldo dengan jumlah yang diberikan jika jumlah tersebut valid (lebih besar dari 0).
- **`void tarikUang(double jumlah)`**: Mengurangi saldo dengan jumlah yang diberikan jika jumlah tersebut valid (lebih besar dari 0 dan tidak melebihi saldo saat ini).

### Unit Testing
Unit test untuk kelas `ATM` diimplementasikan dalam kelas `ATMTest` menggunakan TestNG dengan metode pengujian sebagai berikut:
- **`testLihatSaldo()`**: Menguji apakah metode `lihatSaldo()` mengembalikan saldo yang benar.
- **`testSetorUang()`**: Menguji apakah metode `setorUang()` berfungsi dengan benar ketika jumlah yang valid disetor.
- **`testSetorUangNegatif()`**: Menguji apakah metode `setorUang()` melempar pengecualian ketika jumlah yang negatif disetor.
- **`testTarikUang()`**: Menguji apakah metode `tarikUang()` berfungsi dengan benar ketika jumlah yang valid ditarik.
- **`testTarikUangLebihDariSaldo()`**: Menguji apakah metode `tarikUang()` melempar pengecualian ketika jumlah yang ditarik melebihi saldo saat ini.
- **`testTarikUangNegatif()`**: Menguji apakah metode `tarikUang()` melempar pengecualian ketika jumlah yang negatif ditarik.

## Persyaratan
- Java Development Kit (JDK) 8 atau lebih baru
- Apache Maven untuk manajemen proyek dan dependensi

## Instalasi
1. Clone repositori ini:
   ```bash
   git clone https://github.com/irgantaraa/Irgantara-Ujian2-JuaraCoding.git
2. Masuk ke direktori proyek:
   ```bash
   cd Irgantara-Ujian2-JuaraCoding
3. Bangun proyek menggunakan Maven:
   ```bash
   mvn clean install
### Menjalankan Unit Testing
 ```bash
mvn test

      
