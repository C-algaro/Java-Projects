import java.util.Random; // atender() Random
import java.util.concurrent.ThreadLocalRandom; // double aleatório

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("----------- Procesos Seletivo -------------");

        String [] candidatos = {"JORGE", "MATHEUS", "CLAUDIA", "SUZANA", "BERNARDO"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

        System.out.println("");
    }

    static void selecaoCandidatos () {
        String [] candidatos = {"Hugo", "Paola", "Chavez", "Beatriz", "Caio", "Inês", "Jorge", "Santos", "Gonçalvez"};

        int candidatosSelecionados=0;
        int candidatoAtual=0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" Solicitou esse valor de salário "+ salarioPretendido);

            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato (double salarioPretencao) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretencao) System.out.println("Ligar para o candidato");
        else if(salarioBase == salarioPretencao) System.out.println("Ligar para o candidato com contra proposta");
        else System.out.println("Aguardando resuldado dos demais candidatos");
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM" + candidato + " , NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}

