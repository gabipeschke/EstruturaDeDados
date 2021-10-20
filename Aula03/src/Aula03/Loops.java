package Aula03;

public class Loops {
    public static void main(String[] args) {
        Loops l = new Loops();

        //inicializando o livro

        String linha1 = "Texto da linha 1";
        String linha2 = "Texto da linha 2";
        String linha3 = "Texto da linha 3";
        String linha4 = "Texto da linha 4";
        String linha5 = "Texto da linha 5";
        String linha6 = "Texto da linha 6";
        String linha7 = "Texto da linha 7";
        String linha8 = "Texto da linha 8";

        String livro[][] = {{linha1, linha2}, {linha3, linha4}, {linha5, linha6}, {linha7, linha8}};

        lerMatriz(livro);
    }

    public static void lerMatriz(String[][] livro) {
        for(int pagina=0; pagina< livro.length; pagina++){
            for(int linha=0; linha<livro[0].length; linha++){
                System.out.println(livro[pagina][linha]);
            }
        }
    }
}