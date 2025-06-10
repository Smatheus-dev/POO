public class Abelhinha extends Personagem {

    public Abelhinha() {
        this.nome = "Abelhinha";

    }


    @Override
    public void mover() {
        energia -= 1;
            System.out.println("Abelhinha se moveu. Energia: " + energia);
    }

    @Override
    public void fazerSom() {
            System.out.println("Bzzzz!");
    }

    @Override
    public void comer() {
        energia += 6;
            System.out.println("Comeu e recuperou energia.");
            System.out.println("Energia atual: " + energia);
        
    }
}