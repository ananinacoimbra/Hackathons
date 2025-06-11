package classes;

import java.util.*;
import java.time.LocalDateTime;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Universidade puc = new Universidade("PUC Minas");

        List<Estudante> alunos1 = new ArrayList<>();
        List<Estudante> alunos2 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Estudante e1 = new Estudante();
            e1.setNome("Aluno A" + i);
            e1.setInstituicao(puc);
            alunos1.add(e1);

            Estudante e2 = new Estudante();
            e2.setNome("Aluno B" + i);
            e2.setInstituicao(puc);
            alunos2.add(e2);
        }

        Equipe equipe1 = new Equipe(); equipe1.setMembros(alunos1);
        Equipe equipe2 = new Equipe(); equipe2.setMembros(alunos2);
        Equipes.getInstance().adicionar(equipe1);
        Equipes.getInstance().adicionar(equipe2);

        Profissional orientador1 = new Profissional();
        orientador1.setNome("Prof. João");
        orientador1.setInstituicao(puc);

        Profissional orientador2 = new Profissional();
        orientador2.setNome("Prof. Maria");
        orientador2.setInstituicao(puc);

        Projeto projeto1 = new Projeto();
        projeto1.setTitulo("Projeto Alpha");
        projeto1.setEquipe(equipe1);
        projeto1.setOrientador(orientador1);

        Projeto projeto2 = new Projeto();
        projeto2.setTitulo("Projeto Beta");
        projeto2.setEquipe(equipe2);
        projeto2.setOrientador(orientador2);

        Banca banca1 = new Banca(); banca1.setProjetoAvaliado(projeto1);
        Banca banca2 = new Banca(); banca2.setProjetoAvaliado(projeto2);

        for (int i = 1; i <= 4; i++) {
            Jurado jurado = new Jurado();
            jurado.setNome("Jurado " + i);
            jurado.setInstituicao(puc);
            banca1.adicionarNota(jurado, 6 + i % 2); // 6 ou 7
            banca2.adicionarNota(jurado, 8);
        }

        Apresentacao a1 = new Apresentacao();
        a1.setProjeto(projeto1);
        a1.setBanca(banca1);
        a1.setLocal(new Sala());
        a1.setDataHora(LocalDateTime.now());
        a1.avaliar();

        Apresentacao a2 = new Apresentacao();
        a2.setProjeto(projeto2);
        a2.setBanca(banca2);
        a2.setLocal(new Sala());
        a2.setDataHora(LocalDateTime.now());
        a2.avaliar();

        Apresentacoes.getInstance().adicionar(a1);
        Apresentacoes.getInstance().adicionar(a2);

        System.out.println("Projetos com nota final >= 7:");
        Stream.of(projeto1, projeto2)
                .filter(p -> p.getNotaFinal() >= 7)
                .forEach(p -> System.out.println(p.getTitulo() + " - Nota: " + p.getNotaFinal()));
    }
}
