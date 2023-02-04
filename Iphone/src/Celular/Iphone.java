package Celular;

public class Iphone {
    public static void main(String[] args) throws Exception {
        MultiFuncional aparelho = new MultiFuncional();
        MultiFuncional nav = new MultiFuncional();
        MultiFuncional rep = new MultiFuncional();

        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        System.out.println("");

        nav.adicionarNovaAba();
        nav.exibirPagina();
        nav.atualizarPagina();
        System.out.println("");

        rep.tocar();
        rep.pausar();
        rep.selecionarMusica();
        System.out.println("");
    }
}