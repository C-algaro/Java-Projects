package Celular;

import Celular.Aplicacoes.AparelhoEletronico;
import Celular.Aplicacoes.NavegadorInternet;
import Celular.Aplicacoes.ReprodutorMusical;

public class MultiFuncional implements AparelhoEletronico, NavegadorInternet, ReprodutorMusical {
    public void ligar() {
        System.out.println("LIGANDO PARA O NÚMERO DESEJADO...");
    }
    public void atender() {
        System.out.println("ATENDENDO O TELEFONE...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O CORREIO DE VOZ...");
    }
    public void exibirPagina() {
        System.out.println("EXIBINDO A PÁGINA WEB...");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO A NOVA ABA...");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA...");
    }
    public void tocar() {
        System.out.println("TOCANDO MÚSICA...");
    }
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA...");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA...");
    }
}
