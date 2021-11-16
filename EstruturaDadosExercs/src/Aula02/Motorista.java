package Aula02;

import java.time.LocalDate;
import java.time.Period;

public class Motorista {
    private String nome;
    private LocalDate dataNascimento;
    private Carro carro;
    private double notaAvaliacao;
    private int numeroAvaliacoes;

    public Motorista(String nome, LocalDate dataNascimento, Carro carro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.carro = carro;
        this.notaAvaliacao = 5;
        this.numeroAvaliacoes = 0;
    }

    public Boolean dataNascimentoValida(){
        Period idadeMotorista = Period.between(dataNascimento, LocalDate.now());
        return idadeMotorista.getYears() >= 18;
    }

    public void adicionarAvaliacao(double nota){
        double mediaNota = ((this.notaAvaliacao * this.numeroAvaliacoes) + nota)/(this.numeroAvaliacoes + 1);
        this.notaAvaliacao = mediaNota;
        numeroAvaliacoes++;
    }

    public void pintarCarro(String novaCor){
        carro.setCor(novaCor);
    }

    //getters/setters

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Carro getCarro() {
        return carro;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public int getNumeroAvaliacoes() {
        return numeroAvaliacoes;
    }
}
