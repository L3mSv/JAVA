package PO_LISTAS.SistemaBiblioteca;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(int ID, String titulo, String autor)
    {
        super(ID, titulo);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes()
    {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);

    }
}