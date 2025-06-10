public class Formiga extends Personagem {

    public Formiga() {
        this.nome = "Formiga";

    }

    @Override
    public void mover() {
        energia -= 2;  // Diminui a energia em 2 pontos
            System.out.println("Formiga andou só para frente (-2 de energia). Energia restante: " + energia);
        
        // Verificação opcional de Game Over
        if (energia <= 0) {
            System.out.println("Game Over - Formiga sem energia!");
        }
    }

    @Override
    public void fazerSom() {
        System.out.println("Fzzzz!");
    }

    @Override
    public void comer() {
        energia += 5;
            System.out.println("Comeu e recuperou energia.");
            System.out.println("Energia atual: " + energia);
    }
}
