package br.com.dio.desafio.dominio;

//Classe pai de Mentoria e Curso - Para evitar repetição dos atributos
public abstract class Conteudo {
    //Atributos da classe - protect para só os filhos terem acesso
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    
    //Método abstrato para não ser instanciado como objeto
    public abstract double calcularXp();

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  
    
}
