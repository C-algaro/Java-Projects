package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    //Atributos
    private String nome;
    //Conforme vai se inscrevendo e concluindo os curos, cria um espaço na memória guardando as informações na mesma ordem. 
    //Usa o HashSet ao invés do ArrayList porque só permite um valor de conteúdo único, já que não tem como o aluno se inscrever duas vezes na mesmo curso.
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    //Quando chama o método, se increve 
    public void increverBootcamp(Bootcamp bootcamp) {}

    //A medida que progrede
    public void progredir() {}

    //Quero saber quanto de XP o Dev conseguiu
    public void calcularTotalXP() {}


    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }
    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }
    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }
    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }


    //Hash e Equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoInscritos == null) ? 0 : conteudoInscritos.hashCode());
        result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoInscritos == null) {
            if (other.conteudoInscritos != null)
                return false;
        } else if (!conteudoInscritos.equals(other.conteudoInscritos))
            return false;
        if (conteudoConcluidos == null) {
            if (other.conteudoConcluidos != null)
                return false;
        } else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
            return false;
        return true;
    }   
       
}
