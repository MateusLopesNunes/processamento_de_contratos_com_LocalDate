package model.services;

public class paypal implements ServicoPagamento {

    @Override
    public double taxaPagamento(double amount) {
        return amount * 0.02;
    }

    @Override
    public double juros(double amount, int months) {
        return (amount * 0.01) * months;
    }
}
