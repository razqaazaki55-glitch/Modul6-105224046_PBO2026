package perusahaan;

//class karyawan sebagai superclass
public class Karyawan {
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    //Constructor
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;

        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0;
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    //Getter
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getRatingKinerja() {
        return ratingKinerja;
    }

    //Setter
    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double hitungGajiTotal() {
        int tahunSekarang = 2026; //Asumsi untuk menghitung masa kerja adalah tahun 2026
        int MasaKerja = tahunSekarang - tahunMasuk; // Hitung masa kerja untuk bonus loyalitas
        double bonusLoyalitas = gajiPokok * 0.05 * MasaKerja; //bonus loyalitas 5% dari gajiPokok setiap tahun masa kerja
        double totalGaji = gajiPokok + bonusLoyalitas; //total gaji sementara sebelum penalti 

        //Penalti kinerja jika rating dibawah 2.5 akan dikenakan potongan 10% dari total gaji
        double potonganPenalti = 0;
        if (ratingKinerja < 2.5) {
            potonganPenalti = (gajiPokok + bonusLoyalitas) * 0.10; // Potong 10% dari pokok gaji sebagai penalti
        }

        return gajiPokok + bonusLoyalitas - potonganPenalti;
 
    }

    //Menampilkan informasi karyawan yang berisi ID, Nama, Tahun Masuk, Rating, Gaji Pokok
    public void displayInfo(){
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Rating Kinerja: " + ratingKinerja);
        System.out.printf("Gaji Pokok: Rp %.0f%n", gajiPokok);
    }
}
