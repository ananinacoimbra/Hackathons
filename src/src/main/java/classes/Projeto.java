package classes;

public class Projeto {
    private String titulo;
    private Profissional orientador;
    private Equipe equipe;
    private int nota_final;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Profissional getOrientador() {return orientador;}
    public void setOrientador(Profissional orientador) {this.orientador = orientador;}

    public Equipe getEquipe() {return equipe;}
    public void setEquipe(Equipe equipe) {this.equipe = equipe;}

    public int getNota_final() {return nota_final;}
    public void setNota_final(int nota_final) {this.nota_final = nota_final;}

}
