package Minimarket;

public class MakananRingan extends Produk {
    private String rasa;

    // Constructor
    public MakananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }
}