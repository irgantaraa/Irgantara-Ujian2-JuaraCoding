import com.juaracoding.ATM;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ATMTest {

    private ATM atm;

    @BeforeMethod
    public void setUp() { //Inisialisasi objek ATM dengan saldo awal sebesar 1000 sebelum setiap metode pengujian.
        atm = new ATM(1000);
    }

    @Test
    public void testLihatSaldo() { //  Tes memeriksa apakah saldo yang ditampilkan adalah akurat setelah ATM diinisialisasi.
        assertEquals(atm.lihatSaldo(), 1000.0);
    }

    @Test
    public void testSetorUang() { // Tes apakah metode setorUang(double) berfungsi dengan benar saat saldo ditambah.
        atm.setorUang(500);
        assertEquals(atm.lihatSaldo(), 1500.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif() {
        atm.setorUang(-1000); // Tes apakah pengecualian akan dilempar jika pengguna mencoba menyetor jumlah negatif.
    }

    @Test
    public void testTarikUang() { // Tes apakah metode tarikUang(double) beroperasi dengan benar saat saldo dikurangi.
        atm.tarikUang(300);
        assertEquals(atm.lihatSaldo(), 700.0);
    }
    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo() { //Tes apakah pengecualian terjadi saat pengguna mencoba menarik uang melebihi saldo yang ada.
        atm.tarikUang(1200);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif() { //Tes apakah pengecualian dilempar saat pengguna mencoba menarik jumlah negatif
        atm.setorUang(-1000);
    }
}

