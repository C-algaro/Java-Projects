package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //Atributos
    private LocalDate date;

    //Método padrão da classe
    public Mentoria() {
    }
    
    //Implementação do método obrigatório da classe pai
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //Getters & Setters
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Método String que aparece quando printa a Classe
    @Override
    public String toString() {
        return "Curso [" + 
        "titulo=" + getTitulo() + " | " +
        "descricao=" + getDescricao() + " | " +
        "cargaHoraria=" + date + 
        "]";
    }
    
}
