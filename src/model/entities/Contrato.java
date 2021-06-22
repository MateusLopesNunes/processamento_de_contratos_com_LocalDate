package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private Long numeroContrato;
    private LocalDate dataContrato;
    private Double valorTotal;

    private List<Parcela> parcelas = new ArrayList<>();

    public Contrato () {
    }

    public Contrato(Long numeroContrato, LocalDate dataContrato, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public Long getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorContrato) {
        this.valorTotal = valorContrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void addParcelas (Parcela p) {
        parcelas.add(p);
    }
}
