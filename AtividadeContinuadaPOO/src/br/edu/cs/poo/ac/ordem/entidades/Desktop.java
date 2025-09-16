package br.edu.cs.poo.ac.ordem.entidades;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Desktop extends Equipamento {
    private boolean ehServidor;
    public Desktop(String descricao, TipoEquipamento tipo, boolean ehNovo, double valorEstimado, boolean ehServidor) {
        super(descricao, tipo, ehNovo,valorEstimado);
        this.ehServidor = ehServidor;
    }
}
