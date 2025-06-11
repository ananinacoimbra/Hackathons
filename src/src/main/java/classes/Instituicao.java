package classes;

abstract class Instituicao {
    private String nome;

    public Instituicao() {}
    public Instituicao(String nome) { this.nome = nome; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}

class Universidade extends Instituicao {
    public Universidade() {}
    public Universidade(String nome) { super(nome); }
}

class Empresa extends Instituicao {
    public Empresa() {}
    public Empresa(String nome) { super(nome); }
}