package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {

	DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Long id;
    private LocalDate data;
    private Double valor;

    public Parcela () {
    }

    public Parcela(Long id, LocalDate data, Double valor) {
    	this.id = id;
        this.data = data;
        this.valor = valor;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return data.format(dt) + " - " + String.format("%.2f", valor);

    }
}

