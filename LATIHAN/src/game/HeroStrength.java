package game;

//No.3
public class HeroStrength extends Hero {
    private String type = "Strength";

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    //No.4
    // Override display
    @Override
    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }

    // Override terimaSerangan
    @Override
    public void terimaSerangan(double damage) {
        double damageDiterima = damage * 0.5;
        health -= damageDiterima;
        System.out.println(nama + " (Strength) menerima damage hanya " + damageDiterima);
    }
}