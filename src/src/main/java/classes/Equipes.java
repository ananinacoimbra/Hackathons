package classes;
import java.util.*;

public class Equipes {
    private static Equipes instancia;
    private List<Equipe> lista = new ArrayList<>();

    private Equipes() {}

    public static Equipes getInstance() {
        if (instancia == null) instancia = new Equipes();
        return instancia;
    }

    public void adicionar(Equipe equipe) {
        lista.add(equipe);
    }

    public List<Equipe> getTodas() {
        return lista;
    }
}
