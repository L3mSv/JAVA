package LISTA_04.Exec9;

public class ItemBiblioteca {
    private final int id;
    private static int proximoId = 1;
    private String titulo;

    public ItemBiblioteca(String titulo)
    {
        this.titulo = titulo;
        this.id = proximoId++;

    }

    public void setTitulo(String novoTitulo)
    {
        this.titulo = novoTitulo;
    }

    public String getTitulo()
    {
        return this.titulo;
    }

    public String exibirDetalhes()
    {
        return "\nTitulo: " + this.titulo;
    }
}
