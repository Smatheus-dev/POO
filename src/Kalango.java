public class Kalango extends Personagem {

    public Kalango() {
        this.nome = "Kalango";

    }


    @Override
    public void mover() {
        energia -= 3;
             System.out.println("Kalango se moveu. Energia: " + energia);

        if (energia <= 0) {
            System.out.println("Game Over - Kalango sem energia!");
        }
    }

    @Override
    public void fazerSom() {
        System.out.println("Tssss!");
    }

    @Override
    public void comer() {
        energia += 4;
            System.out.println("Comeu e recuperou energia.");
            System.out.println("Energia atual: " + energia);
    }
}