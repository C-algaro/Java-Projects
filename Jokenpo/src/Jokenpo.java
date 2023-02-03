import java.util.*; 
public class Jokenpo {
    public static void main(String[] args) {
      	Scanner leitor = new Scanner(System.in);

        String jogador1, jogador2;
        System.out.print("Digite a quantidade de partidas desejada: ");
    	int partidas = leitor.nextInt();


    	for (int i = 0; i < partidas; i++) {
            System.out.print("Jogador 1: Pedra, Papel ou Ataque Aéreo? ");
            jogador1 = leitor.next();
            System.out.print("Jogador 2: Pedra, Papel ou Ataque Aéreo? ");
    		jogador2 = leitor.next();

    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
    		else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
    		else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
    		else System.out.println("Sem ganhador");
            System.out.println("");
    	}
    }
}