package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //Atributos
    private int cargaHoraria;
    
    //Método padrão da Classe
    public Curso() {
    }

    //Implementação do método padrão da Classe pai
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //Getters and Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método String que aparece quando printa a Classe
    @Override
    public String toString() {
        return "Curso [" + 
        "titulo=" + getTitulo() + " | " +
        "descricao=" + getDescricao() + " | " +
        "cargaHoraria=" + cargaHoraria + 
        "]";
    }
  
}
