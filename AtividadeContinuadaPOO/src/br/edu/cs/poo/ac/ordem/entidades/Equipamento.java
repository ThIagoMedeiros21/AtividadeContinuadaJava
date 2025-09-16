package br.edu.cs.poo.ac.ordem.entidades;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Equipamento {
    private String descricao;
    private TipoEquipamento tipo;
    private boolean ehNovo;
    private double valorEstimado;
}