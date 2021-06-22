package model.services;

import model.entities.Contrato;
import model.entities.Parcela;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Pagamento {

    private ServicoPagamento servicoPagamento;

    public Pagamento() {
    }

    public Pagamento(ServicoPagamento servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void processamentoContrato(Contrato contrato, Integer mes) {
        double valor = contrato.getValorTotal()/mes;

        for (int i = 1; i <= mes; i++) {
            LocalDate data = addMonths(contrato.getDataContrato(), i);

            double valorJuros = valor + servicoPagamento.juros(valor, i);
            double valorTotal = valorJuros + servicoPagamento.taxaPagamento(valor);

            contrato.addParcelas(new Parcela(null, data , valorTotal));
        }
    }

    private LocalDate addMonths(LocalDate date, int n) {
        return date.plusMonths(n);
    }
}
