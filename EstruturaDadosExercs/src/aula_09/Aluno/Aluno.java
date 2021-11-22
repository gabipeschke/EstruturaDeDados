package aula_09.Aluno;

public class Aluno {
    private String nome;
    private int codigo;
    private double nota;

    public Aluno(String nome, int codigo, double nota) {
        this.nome = nome;
        this.codigo = codigo;
        this.nota = nota;
    }


    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", nota=" + nota +
                '}';
    }
}
