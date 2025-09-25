package br.edu.cs.poo.ac.ordem.entidades;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor

public class FechamentoOrdemServico implements Serializable{
    private String numeroOrdemServico;
    private LocalDate dataFechamento;
    private boolean pago;
    private String relatorioFinal;
}
