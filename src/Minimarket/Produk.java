package Minimarket;

public class Produk { 
    
    protected String namaProduk;
    protected double harga;

    // Constructor
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method tampilkan detail
    public void tampilkanDetail() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}