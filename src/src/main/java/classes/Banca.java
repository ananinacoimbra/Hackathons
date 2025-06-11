package classes;

import java.util.*;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados= new HashMap<>();

    public Projeto getProjetoAvaliado() {return projetoAvaliado;}
    public void serProjetoAvaliado(Projeto projetoAvaliado) {this.projetoAvaliado = projetoAvaliado;}

    //public void adicionarNota(Jurado jurado, int nota) {
       // jurado.put(jurado,nota);
    //}

    public void calcularNotaFinal() {
        int soma = jurados.values().stream().mapToInt(Integer::intValue).sum();
        int media = soma/jurados.size();
        projetoAvaliado.setNota_final(media);
    }

}