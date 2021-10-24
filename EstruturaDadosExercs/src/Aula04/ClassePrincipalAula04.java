package Aula04;

import Aula04.Postagem.Postagem;

public class ClassePrincipalAula04 {

    public static void main(String[] args) {
        Postagem postagem1 = new Postagem(1, "tituto 1", "conteudoTexto 1", true);
        Postagem postagem2 = new Postagem(4, "tituto 2", "conteudoTexto 2", false);
        Postagem postagem3 = new Postagem(9, "tituto 3", "conteudoTexto 3", true);
        Postagem postagem4 = new Postagem(5, "tituto 4", "conteudoTexto 4", false);
        Postagem postagem5 = new Postagem(12, "tituto 5", "conteudoTexto 5", true);

        Postagem postagens[] = {postagem1, postagem2, postagem3, postagem4, postagem5};

        Vetores vetores = new Vetores(postagens);

        vetores.imprimePostagens();
    }

}
