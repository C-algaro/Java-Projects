import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
//teste

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //Por "Conteúdo" ser abstrato eu não posso instanciar ele, mas eu posso criar um novo curso a partir de uma classe abstrata (polimorfismo)
        //Conteudo conteudo = new Curso();
        //Conteudo conteudo = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setDate(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devChrystian = new Dev();
        devChrystian.setNome("Chrystian");
        devChrystian.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Chrystian:" + devChrystian.getConteudoInscritos());
        devChrystian.progredir();
        devChrystian.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Chrystian:" + devChrystian.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Chrystian:" + devChrystian.getConteudoConcluidos());
        System.out.println("XP:" + devChrystian.calcularTotalXP());

        System.out.println("-------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:"+ devJoao.calcularTotalXP());
    }
}