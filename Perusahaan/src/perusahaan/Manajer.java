package perusahaan;

//class manajer sebagai subclass dari Karyawan
public class Manajer extends Karyawan {
    //Atribut tambahan
    private String divisi;
    private int jumlahAnggotaTim;

    //Constructor
    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi            = divisi;
        this.jumlahAnggotaTim  = jumlahAnggotaTim;
    }

    //Getter
    public String getDivisi(){ 
        return divisi; 
    }

    public int getJumlahAnggotaTim(){ 
        return jumlahAnggotaTim; 
    }

    //Setter
    public void setDivisi(String divisi){ 
        this.divisi = divisi; 
    }

    public void setJumlahAnggotaTim(int j){ 
        this.jumlahAnggotaTim = j; 
    }

    // Override method hitungGajiTotal() untuk menghitung gaji total manajer
    @Override
    public double hitungGajiTotal() {
        // Total perhitungan gaji dari superclass
        double totalGaji = super.hitungGajiTotal();

        // Tunjangan manajerial Rp300.000 per anggota tim
        double tunjanganManajerial = jumlahAnggotaTim * 300000;
        totalGaji = totalGaji + tunjanganManajerial;

        // Bonus kinerja ekstra 15% jika rating kinerja manajer di atas 4.5
        if (getRatingKinerja() > 4.5) {
            totalGaji = totalGaji * 1.15; // tambahan bonus 15% dari total gaji sementara 
        }

        return totalGaji;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // tampilkan info dasar dulu
        System.out.println("Jabatan      : Manajer");
        System.out.println("Divisi       : " + divisi);
        System.out.println("Anggota Tim  : " + jumlahAnggotaTim + " orang");
    }
}