package classes;
import java.time.*;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public void setProjeto(Projeto projeto) {this.projeto = projeto;}
    public void setBanca(Avaliavel banca) {this.banca = banca;}
    public void setLocal(Sala local) {this.local = local;}
    public void setDataHora(LocalDateTime dataHora) {this.dataHora = dataHora;}

    public void avaliar (){
        banca.calcularNotaFinal();
    }

}
