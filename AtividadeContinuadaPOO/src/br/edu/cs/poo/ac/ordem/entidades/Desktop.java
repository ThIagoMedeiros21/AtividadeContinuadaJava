package br.edu.cs.poo.ac.ordem.entidades;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Desktop extends Equipamento {

    private boolean ehServidor;

    public Desktop(String Serial, String descricao, boolean ehNovo, double valorEstimado, boolean ehServido) {
        super(Serial, descricao, ehNovo, valorEstimado);
        this.ehServidor = ehServido;
    }

    public String getIdTipo() {
        return "DE";
    }
}