public class Pagina {
    private String titulo,link;

    public Pagina(String titulo, String link) {
        this.titulo = titulo;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "titulo='" + titulo + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
