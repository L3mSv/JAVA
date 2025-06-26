package LISTA_04.Exec9;

public class DVD extends ItemBiblioteca{
    private int duracaoMinutos;

    public DVD(String titulo, int duracao)
    {
        super(titulo);
        this.duracaoMinutos = duracao;
    }

    public int getDuracao()
    {
        return this.duracaoMinutos;
    }

    public void setDuracao(int novaDuracao)
    {
        this.duracaoMinutos = novaDuracao;
    }

    @Override
    public void exibirDetalhes()
    {
        super.exibirDetalhes();
        System.out.println("Duracao: " + duracaoMinutos + " min(s)\n");

    }

}
