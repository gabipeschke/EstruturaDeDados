package Aula05;

import java.util.Scanner;

public class ClassePrincipalAula05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //exercício 1
        System.out.println("//Exercício 01");

        System.out.println("Digite o tamanho da matriz desejada:");

        System.out.println("Linhas:");
        int linhas = ler.nextInt();

        System.out.println("Colunas:");
        int colunas = ler.nextInt();

        int[][] matriz = new int [linhas][colunas];

        //preencher
        int count = 1;
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                matriz[i][j] = count;
                count++;
            }
        }

        //imprimir
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //exercício 2
        System.out.println("//Exercício 02");

        String[][] matrizTexto = {{"aipim", "morango"}, {"cenoura", "abobrinha"}, {"pizza", "repolho"}};

        //limpar enter
        ler.nextLine();

        System.out.println("Digite o texto de procura:");
        String textoProcura = ler.nextLine();

        String resultado = procuraTextoEmMatriz(matrizTexto, textoProcura);

        System.out.println(resultado);
    }

    public static String procuraTextoEmMatriz(String[][] matriz, String textoProcura){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j].contains(textoProcura)){
                    return "Linha: " + i + "\nColuna: " + j;
                }
            }
        }

        return "Texto não encontrado";
    }
}
