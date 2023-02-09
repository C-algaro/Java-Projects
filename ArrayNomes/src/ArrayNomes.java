import java.util.Scanner;

public class ArrayNomes {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++) {
            System.out.print("Digite o nome "+(i+1)+" : ");
            nomes[i] = leitor.nextLine();
        }
    
    System.out.println("");
    System.out.println("O Terceiro nome digitado foi: "+nomes[2]);
    System.out.println("O Sétimo nome digitado foi: "+nomes[6]);
    System.out.println("O Nono nome digitado foi: "+nomes[8]);
    System.out.println("");
	}
}