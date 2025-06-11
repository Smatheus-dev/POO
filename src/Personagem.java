public  abstract class Personagem {
    public abstract void mover ();

    protected String nome;  // Novo atributo para identificar cada animal
    protected int energia;
    public abstract void fazerSom();

    public abstract void comer();

    public boolean estaCansado() {
        return energia < 5;
    }

    public void dormir() {
        energia += 10;
        System.out.println("O personagem dormiu e recuperou 10 pontos de energia. Energia atual: " + energia);
    }
    public Personagem(){   
    }
    public abstract void atacar();
}


    



