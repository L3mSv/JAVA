package PO_LISTAS.SistemaBiblioteca;

public class DVD extends ItemBiblioteca{
    private int duracaoMinutos;

    public DVD(int id, String titulo, int duracao)
    {
        super(id, titulo);
        this.duracaoMinutos = duracao;
    }

    @Override
    public void exibirDetalhes()
    {
        super.exibirDetalhes();
        System.out.println("Duracao: " + duracaoMinutos);

    }
}
