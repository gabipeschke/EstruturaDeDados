package Aula04;

import Aula04.Postagem.Postagem;

public class Vetores {
    public Postagem[] postagens;

    public Vetores(Postagem[] postagens) {
        this.postagens = postagens;
    }


    public void imprimePostagens(){
        for(Postagem postagem : postagens){
            if(postagem.isPublico()){
                System.out.println(postagem.toString());
            }
        }
    }


}
