package game;

public class App {
    public static void main(String[] args) {
        HeroStrength hero1 = new HeroStrength("Gatotkaca", 100, 20);

        hero1.display();
        System.out.println();

        hero1.berlatih();
        System.out.println();

        hero1.terimaSerangan(15);
        System.out.println();

        hero1.display();
    }
}