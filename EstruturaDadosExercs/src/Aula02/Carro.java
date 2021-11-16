package Aula02;

import java.time.LocalDate;

public class Carro {
    private String placa;
    private LocalDate dataVencimento;
    private String cor;
    private String modelo;

    public Carro(String placa, LocalDate dataVencimento, String cor, String modelo) {
        this.placa = placa;
        this.dataVencimento = dataVencimento;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Boolean dataVencimentoValida(){
        return dataVencimento.isAfter(LocalDate.now());
    }

    //getters/setters

    public String getPlaca() {
        return placa;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
}
