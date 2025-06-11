package classes;
import java.util.*;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> lista= new Apresentacoes(); //?
    private Apresentacoes() {};

    public static Apresentacoes getInstance() {
        if (instance == null) instance = new Apresentacoes();
        return instance;
    }

    public void adicionae (Apresentacao apresenta){
        lista.add(apresenta);
    }
    public List<Apresentacao> getTodas(){
        return lista;
    }
}
