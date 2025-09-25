package br.edu.cs.poo.ac.ordem.entidades;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class OrdemServico implements Serializable {
    private Cliente cliente;
    private PrecoBase precoBase;
    private Notebook notebook;
    private Desktop desktop;
    private LocalDateTime dataHoraAbertura;
    private int prazoEmDias;
    private double valor;

    public LocalDate getDataEstimadaEntrega() {
        LocalDate dataAbertura = dataHoraAbertura.toLocalDate();
        return dataAbertura.plusDays(prazoEmDias);
    }

    public String getNumero() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMyyyyddHHmm");
        String dataFormatada = dataHoraAbertura.format(formatter);
        String documento = cliente.getCpfCnpj();
        if (documento.length() == 14) {
            return dataFormatada + documento;
        } else {
            return dataFormatada + "000" + documento;
        }
    }
}
