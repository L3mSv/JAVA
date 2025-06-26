package LISTA_04.Exec9;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, String autor)
    {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes()
    {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor + "\n");

    }
}
