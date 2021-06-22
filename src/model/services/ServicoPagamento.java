package model.services;

import java.io.Serializable;

public interface ServicoPagamento {

    double taxaPagamento(double amount);

    double juros (double amount, int months);
}
