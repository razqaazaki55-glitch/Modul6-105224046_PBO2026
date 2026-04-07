package Minimarket;

public class MakananRingan extends Produk {
    private String rasa;

    // Constructor
    public MakananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }

    // Override method tampilkanDetail
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Rasa: " + rasa);
    }
}