

public class App {
    public static void main(String[] args) throws Exception {

        // Definindo energia inicial 
            Formiga f = new Formiga(); // Declara a variável 'f' e armazena nela um novo objeto Formiga.
            f.energia = 10;  

            Kalango k = new Kalango();
            k.energia = 10;

            Abelhinha a = new Abelhinha();  
            a.energia = 10;

        
        // Testando a Formiga
            System.out.println("=== TESTANDO FORMIGA ===");

            // Executa a ação de mover 3 vezes.
            // O laço 'for' inicializa um contador 'i' em 0 e, enquanto 'i' for menor que 3,
            // executa o método f.mover() e incrementa 'i' em 1 a cada passagem.
            for (int i = 0; i < 3; i++) {
                f.mover();
            }

            f.fazerSom();
            f.comer();
            f.dormir();
            System.out.println("Energia final da Formiga: " + f.energia + "\n");
            f.atacar();            

        // Testando o Kalango
        
            System.out.println("=== TESTANDO KALANGO ===");
            for (int i = 0; i < 3; i++) {
                k.mover();
            }

            k.mover();
            k.fazerSom();
            k.comer();
            k.dormir();
            System.out.println("Energia final do Kalango: " + k.energia + "\n");
            k.atacar();

        // Testando a Abelhinha
       
            System.out.println("=== TESTANDO ABELHINHA ===");
            for (int i = 0; i < 3; i++) {
                a.mover();
            }

            a.fazerSom();
            a.comer();
            a.dormir();
            System.out.println("Energia final da Abelhinha: " + a.energia);
            a.atacar();

    }
}