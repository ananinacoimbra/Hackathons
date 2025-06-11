package classes;

import java.util.*;

public class Equipe {
    private List<Estudante> membros = new ArrayList<>();
    public List<Estudante> getMembros(){
        return membros;
    }
    public void setMembros(List<Estudante> membros){this.membros = membros;}
}
