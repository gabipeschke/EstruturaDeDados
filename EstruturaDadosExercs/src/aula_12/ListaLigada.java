package aula_12;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho = 0;

    public ListaLigada() {
    }

    public Elemento getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }

        ++this.tamanho;
    }

    public void remover(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;

        for(int i = 0; i < this.getTamanho(); ++i) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == this.primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo((Elemento)null);
                } else if (atual == this.ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo((Elemento)null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }

                --this.tamanho;
                break;
            }

            anterior = atual;
            atual = atual.getProximo();
        }

    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;

        for(int i = 0; i < posicao; ++i) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }
}
