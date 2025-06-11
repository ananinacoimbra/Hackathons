package classes;

abstract class Pessoa {
        private String nome;
        private Instituicao instituicao;

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }
        public Instituicao getInstituicao() { return instituicao; }
        public void setInstituicao(Instituicao instituicao) { this.instituicao = instituicao; }
    }

    class Estudante extends Pessoa {}
    class Profissional extends Pessoa {}
    class Jurado extends Profissional {}

