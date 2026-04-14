import Rental.Kendaraan;
import Rental.Motor;
import Rental.Mobil;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Kendaraan> daftar = new ArrayList<>();

        daftar.add(new Mobil("B 1234 AA", "Toyota", 2010, 200000, 7));
        daftar.add(new Mobil("B 5678 BB", "Honda", 2018, 250000, 5));
        daftar.add(new Motor("B 8787 RR", "Yamaha", 2020, 100000, 300));
        daftar.add(new Motor("B 8888 ZZ", "Honda", 2022, 80000, 150));

        // Looping 
        for (Kendaraan k : daftar) {
            k.displayInfo();
            System.out.println("Total Biaya Sewa selama 5 Hari: " + k.hitungHargaSewa(5));
        }
    }
}