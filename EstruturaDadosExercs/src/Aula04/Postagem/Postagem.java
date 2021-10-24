package Aula04.Postagem;

public class Postagem {

    private long idUsuario;
    private String titulo;
    private String conteudoTexto;
    private boolean publico;

    public Postagem(long idUsuario, String titulo, String conteudoTexto, boolean publico) {
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.conteudoTexto = conteudoTexto;
        this.publico = publico;
    }

    @Override
    public String toString() {
        return "Postagem{" +
                "idUsuario=" + idUsuario +
                ", titulo='" + titulo + '\'' +
                ", conteudoTexto='" + conteudoTexto + '\'' +
                ", publico=" + publico +
                '}';
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudoTexto() {
        return conteudoTexto;
    }

    public boolean isPublico() {
        return publico;
    }
}
