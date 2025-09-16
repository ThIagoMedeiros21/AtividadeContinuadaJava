package br.edu.cs.poo.ac.ordem.entidades;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Notebook extends Equipamento {
    private boolean carregaDadosSensiveis;
    public Notebook(String descricao, TipoEquipamento tipo, boolean ehNovo, double valorEstimado, boolean carregaDadosSensiveis) {
        super(descricao, tipo, ehNovo, valorEstimado);
        this.carregaDadosSensiveis = carregaDadosSensiveis;
    }
}
