package perusahaan;

//class Developer sebagai subclass dari Karyawan
public class Developer extends Karyawan {
    private String level;       
    private int jumlahBugFix;

    //Constructor
    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level        = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    //Getter
    public String getLevel() { 
        return level; 
    }

    public int getJumlahBugFix() { 
        return jumlahBugFix; 
    }

    //Setter
    public void setLevel(String level){ 
        this.level = level; 
    }
    public void setJumlahBugFix(int j){ 
        this.jumlahBugFix = j; 
    }

    @Override
    public double hitungGajiTotal() {
        //Total perhitungan gaji dari superclass
        double totalGaji = super.hitungGajiTotal();

        // Tunjangan berdasarkan level
        double tunjanganLevel = 0; //Junior
        if (level.equalsIgnoreCase("Mid")) { //penggunaan equalsIgnoreCase untuk membandingkan string tanpa memperhatikan huruf besar/kecil pada saat user memasukkan level
            tunjanganLevel = 1500000; //Mid
        } else if (level.equalsIgnoreCase("Senior")) { ////penggunaan equalsIgnoreCase untuk membandingkan string tanpa memperhatikan huruf besar/kecil pada saat user memasukkan level
            tunjanganLevel = 3000000; //Senior
        }
        // Junior
        totalGaji = totalGaji + tunjanganLevel;

        // Bonus bug hanya jika rating >= 3.0
        if (getRatingKinerja() >= 3.0) {
            double bonusBug = jumlahBugFix * 50000;
            totalGaji = totalGaji + bonusBug;
        }
        // Jika rating < 3.0, bonus bug hangus tidak akan ditambahkan maka akan mengembalikan nilai totalGaji 
        return totalGaji;
    }

    @Override
    // Override displayInfo() untuk menampilkan info tambahan developer
    public void displayInfo() {
        super.displayInfo(); // tampilkan info dasa
        System.out.println("Jabatan      : Developer (" + level + ")");
        System.out.println("Jumlah BugFix: " + jumlahBugFix);
    }
}