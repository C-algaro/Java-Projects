import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de teste: ");
        int c = leitor.nextInt();

        System.out.println("");
        
        for (int i=0; i<c; i++) {
            System.out.print("Digite o primeiro nome do Super-Herói: ");
            String nome = leitor.next();
            System.out.print("Quantidade de força aplicada: ");
            int forca = leitor.nextInt();

            if (nome.equals("Thor")) System.out.println("y");
            else System.out.println("n");

            System.out.println("");
        }
    }
}
