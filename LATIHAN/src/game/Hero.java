package game;

public class Hero {
    protected String nama;
    protected double health;
    protected double attackPower;

    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Health: " + this.health);
        System.out.println("Attack Power: " + this.attackPower);
    }

    public void berlatih() {
        this.attackPower += 5;
        System.out.println(this.nama + " selesai berlatih. Attack Power sekarang: " + this.attackPower);
    }

    public void terimaSerangan(double damage) {
        this.health -= damage;
    }
}