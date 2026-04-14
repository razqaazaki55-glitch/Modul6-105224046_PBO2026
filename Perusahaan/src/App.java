// Import class dari package perusahaan
import perusahaan.Karyawan;
import perusahaan.Developer;
import perusahaan.Manajer;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // ArrayList bertipe Karyawan bisa menampung Developer & Manajer
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        //Objek 1: Karyawan biasa, rating 2.0 harus terkena penalti
        Karyawan k1 = new Karyawan("K001", "Rizqy Hergiansyah", 2020, 8000000, 2.0);
        daftarKaryawan.add(k1);

        //Objek 2: Developer Senior, rating 4.0, 20 bugfix mendapatkan bonus maksimal 
        Developer d1 = new Developer("D001", "Rafly Setiawan", 2018, 10000000, 4.0, "Senior", 20);
        daftarKaryawan.add(d1);

        //Objek 3: Developer Mid, rating 2.8, 15 bugfix bonus bug hangus karena rating < 3.0
        Developer d2 = new Developer("D002", "Razqa kusuma", 2024, 7000000, 2.8, "Mid", 15);
        daftarKaryawan.add(d2);

        //Objek 4: Manajer IT, rating 4.8, 10 anggota mendapatkan bonus kinerja ekstra sebesar 15%
        Manajer m1 = new Manajer("M001", "Yudha Hardiansyah", 2015, 15000000, 4.8, "IT", 10);
        daftarKaryawan.add(m1);

        //Objek 5: Manajer HR, rating 3.5, 3 anggota -> TUNJANGAN MANAJERIAL BIASA ---
        Manajer m2 = new Manajer("M002", "Hendra Saputra", 2025, 12000000, 3.5, "HR", 3);
        daftarKaryawan.add(m2);

        //Untuk menyimpan nilai total anggaran gaji, gaji tertinggi, nama pemilik gaji tertinggi, dan total rating untuk hitung rata-rata
        double totalAnggaranGaji = 0;  // total gaji semua karyawan
        double gajiTertinggi     = 0;  // gaji tertinggi 
        String namaHighestEarner = " "; // nama pemilik gaji tertinggi
        double totalRating       = 0;  // jumlah rating untuk hitung rata-rata

        //
        System.out.println("=====================");
        System.out.println("LAPORAN GAJI KARYAWAN");
        System.out.println("=====================");

        for (Karyawan k : daftarKaryawan) {

            // Panggil displayInfo() sesuai tipe objeknya 
            k.displayInfo();

            // Cetak total gaji bulan ini
            double gajiTotal = k.hitungGajiTotal();
            System.out.printf("Total Gaji Bulan Ini : Rp %.0f%n", gajiTotal);
            System.out.println("------------------------------------------");

            // Hitung total anggaran gaji
            totalAnggaranGaji = totalAnggaranGaji + gajiTotal;

            // Temukan gaji tertinggi
            if (gajiTotal > gajiTertinggi) {
                gajiTertinggi     = gajiTotal;
                namaHighestEarner = k.getNama();
            }

            // Hitung total rating untuk rata-rata
            totalRating = totalRating + k.getRatingKinerja();
        }

        // Cetak laporan akhir setelah loop selesai menelusuri seluruh karyawan

        // Cetak total anggaran gaji perusahaan
        System.out.printf("Total Anggaran Gaji Perusahaan : Rp %.0f%n", totalAnggaranGaji);

        // Cetak nama karyawan dengan gaji tertinggi
        System.out.printf("Highest Earner                 : %s (Rp %.0f)%n", namaHighestEarner, gajiTertinggi);

        // Hitung dan cetak rata-rata rating kinerja seluruh karyawan
        double rataRataRating = totalRating / daftarKaryawan.size();
        System.out.printf("Rata-rata Rating Kinerja       : %.2f%n", rataRataRating);
    }
}