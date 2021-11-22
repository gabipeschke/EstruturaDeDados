package aula_09;

import aula_09.Aluno.Aluno;

public class ClassePrincipalAula09 {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];

        //inicializando alunos
        alunos[0] = new Aluno("Augusto", 123, 7.3);
        alunos[1] = new Aluno("Matheus", 124, 10);
        alunos[2] = new Aluno("Carlos", 125, 9.4);
        alunos[3] = new Aluno("Eduardo", 126, 4.6);
        alunos[4] = new Aluno("Larissa", 127, 8.4);
        alunos[5] = new Aluno("Karoll", 128, 3.1);
        alunos[6] = new Aluno("Monica", 129, 9.2);
        alunos[7] = new Aluno("Vagner", 130, 6.3);
        alunos[8] = new Aluno("Will", 131, 2.9);
        alunos[9] = new Aluno("Daniel", 132, 9.6);

        //ordenando
        Aluno[] alunosOrdenados = insertionSort(alunos);

        for (int i = 0; i < alunosOrdenados.length; i++) {
            System.out.println(alunosOrdenados[i]);
        }
    }

    private static Aluno[] insertionSort(Aluno[] array) {
        Aluno key;
        int i;

        for (int j = 1; j < array.length; j++) {
            key = array[j];

            for (i = j - 1; (i >= 0) && (array[i].getNota() < key.getNota()); i--) {
                array[i + 1] = array[i];
            }

            array[i + 1] = key;
        }

        return array;
    }
}
