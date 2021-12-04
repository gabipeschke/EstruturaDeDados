package aula_12;

public class Fila {
    private ListaLigada lista = new ListaLigada();

    public Fila() {
    }

    public void adicionar(String novoValor) {
        this.lista.adicionar(novoValor);
    }

    public void remover() {
        this.lista.remover(this.get());
    }

    public String get() {
        return this.lista.getPrimeiro().getValor();
    }
}
