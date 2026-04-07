package game;

public class HeroStrength extends Hero {

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Strength");
    }

    @Override
    public void terimaSerangan(double damage) {
        // Hero Strength punya pertahanan lebih (damage hanya masuk 50%)
        double damageMasuk = damage * 0.5;
        this.health = this.health - damageMasuk;
        System.out.println(this.nama + " Strength menerima damage: " + damageMasuk);
    }
}