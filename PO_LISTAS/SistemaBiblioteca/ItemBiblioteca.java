package LISTA_04.Exec9;

public class ItemBiblioteca {
    private final int ID;
    private static int proxID = 1;
    private String titulo;

    public ItemBiblioteca(String titulo)
    {
        this.titulo = titulo;
        this.ID = proxID++;
    }

    public int getID()
    {
        return this.ID;
    }

    public String getTitulo()
    {
        return this.titulo;
    }

    public void exibirDetalhes()
    {
        System.out.println("ID: " + ID);
        System.out.println("Titulo: " + titulo);
    }

    @Override
    public String toString()
    {
        return getTitulo();
    }
}
