package game;

//No.1
public class Hero {
    String nama;
    double health;
    double attackPower;

    // Constructor
    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    //No.2
    // Method display
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    // Method berlatih
    public void berlatih() {
        attackPower = attackPower + 10;
        System.out.println(nama + " sedang berlatih! Attack Power bertambah.");
    }

    //No.3
    // Method menerima serangan
    public void terimaSerangan(double damage) {
        health = health - damage;
        System.out.println(nama + " menerima damage sebesar " + damage);
    }
}