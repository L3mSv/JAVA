package PO_LISTAS.SistemaBiblioteca;

public class ItemBiblioteca {
    private final int ID;
    private String titulo;

    public ItemBiblioteca(int ID, String titulo)
    {
        this.ID = ID;
        this.titulo = titulo;
    }

    public void exibirDetalhes()
    {
        System.out.println("ID: " + ID);
        System.out.println("Titulo: " + titulo);
    }
}
