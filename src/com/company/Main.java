package com.company;

import model.entities.Contrato;
import model.services.Pagamento;
import model.services.paypal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            System.out.println("Enter contract data");
            System.out.println("Number: ");
            long numero = sc.nextInt();
            System.out.println("Date: ");
            String data = sc.next();
            LocalDate dataLocal = LocalDate.parse(data, dt);
            System.out.println("Contract value: ");
            double valorContrato = sc.nextDouble();

            Contrato contrato = new Contrato(numero, dataLocal, valorContrato);

            System.out.println("Enter number of installments: ");
            int n = sc.nextInt();

            Pagamento pagamento = new Pagamento(new paypal());
            pagamento.processamentoContrato(contrato, n);

            contrato.getParcelas().forEach(x -> System.out.println(x.toString()));
        }
        catch (RuntimeException e) {
            e.getMessage();
        }
        finally {
            sc.close();
        }
    }
}
