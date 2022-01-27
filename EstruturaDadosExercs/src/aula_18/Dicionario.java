package aula_18;

public class Dicionario {
    ListaDinamica Vetor[];

    public Dicionario() {
        Vetor = new ListaDinamica[26];
    }

    final void inicializaListas() {
        for (int i=0; 1<26; i++){
            Vetor[i] = new ListaDinamica();
        }
    }

    final int funcaoHash(String palavra) {
        palavra = palavra.toLowerCase();
        int posicao = palavra.charAt(0);

        return posicao - 97;
    }

    final void addTabela(String palavra, String descricao){
        Vetor[funcaoHash(palavra)].add(palavra, descricao);
    }

    final void excluiItem(String palavra){
        System.out.println("***Itens nesse indice**\n");

        Vetor[funcaoHash(palavra)].ImprimeLista();
        Vetor[funcaoHash(palavra)].removeItem(palavra);

        System.out.println("***Itens nesse indice aós remoção**\n");
        Vetor[funcaoHash(palavra)].ImprimeLista();
    }

    final void buscaPalavra(String palavra){
        Vetor[funcaoHash(palavra)].buscaItem(palavra);
    }

    public static void main(String[] args){
        Dicionario teste = new Dicionario();
        teste.addTabela("Teste1", "Teste1 descricao");
        teste.addTabela("Teste2", "Teste2 descricao");

        //teste.excluiItem("Bolo");
    }

}
