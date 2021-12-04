package aula_12;

public class ClassePrincipal {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.adicionar("Gabi");
        fila.adicionar("Moni");
        fila.adicionar("Will");
        fila.adicionar("Vagner");
        fila.adicionar("Lari");

        System.out.println("Primeiro da fila:" + fila.get());
        fila.remover();

        System.out.println("Novo Primeiro da fila:" + fila.get());
        fila.remover();

        System.out.println("Novo Primeiro da fila:" + fila.get());
    }
}
