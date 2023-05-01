import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Curso de Java");
        mentoria.setDescricao("Local para interagir e tirar dúvidas");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Aqui você terá a descrição do Bootcamp");
        bootcamp.getConteúdos().add(curso1);
        bootcamp.getConteúdos().add(curso2);
        bootcamp.getConteúdos().add(mentoria);

        Dev devTininho = new Dev();
        devTininho.setNome("Tininho");
        devTininho.inscreverBootcamo(bootcamp);
        System.out.println("Conteudos Inscritos Tininho" + devTininho.getConteudosInscritos());
        devTininho.progredir();
        devTininho.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Tininho" + devTininho.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Tininho" + devTininho.getConteudosConcluidos());
        System.out.println("XP:" + devTininho.calcularTotalXp());


        Dev devSimba = new Dev();
        devSimba.setNome("Simba");
        devSimba.inscreverBootcamo(bootcamp);
        System.out.println("Conteudos Inscritos Simba" + devSimba.getConteudosInscritos());
        devSimba.progredir();
        devSimba.progredir();
        devSimba.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Simba" + devSimba.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Simba" + devSimba.getConteudosConcluidos());
        System.out.println("XP:" + devSimba.calcularTotalXp());




    }

}