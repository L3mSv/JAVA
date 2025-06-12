package LISTA_04.Exec9;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, String autor)
    {
        super(titulo);
        this.autor = autor;
    }

    public void setAutor(String novoAutor)
    {
        this.autor = novoAutor;
    }

    public String getAutor()
    {
        return this.autor;
    }

    @Override
    public String exibirDetalhes()
    {
        return  super.exibirDetalhes() +
                "\nAutor: " + this.autor;

    }
}
